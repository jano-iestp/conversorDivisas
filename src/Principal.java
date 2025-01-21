import com.google.gson.JsonSyntaxException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcionElegida = 0;
        String continuar = "s";

        ConsultarConversion consulta = new ConsultarConversion();
        Calculos calculos = new Calculos(consulta);
        GenerarArchivos generador = new GenerarArchivos();
        List<String> respuestas = new ArrayList<>();

        String menu = """
                \n***************************************************
                *** Sea bienvenido al Conversor de Monedas ***
                
                1) Sol ==>> Dólar Estadounidense
                2) Sol ==>> Euro
                3) Sol ==>> Libra Esterlina
                4) Dólar Estadounidense ==>> Sol
                5) Euro ==>> Sol
                6) Libra Esterlina ==>> Sol
                
                7) Otra opción de conversión
                ***************************************************
                """;

        do {
            try {
                System.out.println(menu);
                opcionElegida = Integer.parseInt(lectura.nextLine());

                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedDate = myDateObj.format(myFormatObj);

                switch (opcionElegida) {
                    case 1:
                        calculos.almacenarValores("PEN", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 2:
                        calculos.almacenarValores("PEN", "EUR");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 3:
                        calculos.almacenarValores("PEN", "GBP");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 4:
                        calculos.almacenarValores("USD", "PEN");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 5:
                        calculos.almacenarValores("EUR", "PEN");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 6:
                        calculos.almacenarValores("GBP", "PEN");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 7:
                        calculos.almacenarValoresPersonalizados();
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    default:
                        System.out.println("Ingrese una opción válida.");
                        continue;
                }

                if (opcionElegida != 8) {
                    System.out.println("¿Desea seguir usando el conversor? (s para sí, n para no): ");
                    continuar = lectura.nextLine().toLowerCase();
                    if (!continuar.equals("s") && !continuar.equals("n")) {
                        System.out.println("Opción inválida. Asumiendo 'n'.");
                        continuar = "n";
                    }
                } else {
                    continuar = "n";
                }
            } catch (JsonSyntaxException | NullPointerException e) {
                System.out.println("Error. Ingrese solo códigos de moneda válidos.");
                continuar = "s";
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. Ingrese un valor numérico válido.");
                continuar = "s";
            }
        } while (continuar.equals("s"));

        generador.guardarJson(respuestas);
        System.out.println("Finalizando programa.");
    }
}
