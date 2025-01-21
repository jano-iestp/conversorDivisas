import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarConversion {
    public String buscaConversion(String monedaBase, String monedaCambio, double cantidad) {
        try {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/13a2345d2fb9b7c22843e5e8/latest/"  + monedaBase);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            var json = response.body();
            JsonElement jsonElement = JsonParser.parseString(json);
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            // Validar si la respuesta contiene tasas de cambio
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            if (conversionRates == null || !conversionRates.has(monedaCambio)) {
                throw new RuntimeException("La moneda de cambio no está disponible en la API.");
            }

            double tasaCambio = conversionRates.get(monedaCambio).getAsDouble();
            double resultado = cantidad * tasaCambio;
            return String.format("%.2f %s", resultado, monedaCambio);

        } catch (NumberFormatException | IOException | InterruptedException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            throw new RuntimeException("Error: " + e.getMessage());
        }
    }
}
