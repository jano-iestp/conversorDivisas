# 🪙 Conversor de Monedas

Este proyecto consiste en el desarrollo de una aplicación de consola en **Java** que permite realizar conversiones de divisas en tiempo real utilizando una **API externa de tasas de cambio**. Fue desarrollado como parte de un curso impartido por **AluraLatam**, con el objetivo de aprender a implementar conceptos fundamentales de Java, integración con servicios externos y buenas prácticas en programación.

## 🚀 **Características principales**

1. **Interfaz de Usuario en Consola** 
    La aplicación presenta un menú intuitivo que permite al usuario seleccionar las monedas de origen y destino, e ingresar el monto a convertir.
    
2. **Soporte para Múltiples Divisas** 
    El conversor soporta las siguientes conversiones:
	- **Dólar** → **Sol Peruano**
	- **Sol Peruano** → **Dólar**
	- **Dólar** → **Real Brasileño**
	- **Real Brasileño** → **Dólar**
	- **Dólar** → **Peso Mexicano**
	- **Peso Mexicano** → **Dólar**
    
3. **Integración con API Externa**:
    La aplicación consume la siguiente API externa [# ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de conversión de cambio. 
    
4. **Código modular y escalable**
- Uso de clases separadas para la lógica de conversión y manejo de opciones.
- Preparado para añadir más divisas con facilidad.

## 📥 **Instalación y configuración**
### **Requisitos previos**
- Java 17 o superior instalado (Puede descargarse desde [aquí](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)).
- **Gson Library**: Biblioteca para manejar JSON. (**ya viene dentro del repositorio**)
#### **Recomendaciones**
- Instalar [IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=windows)
- Crear un nuevo proyecto del siguiente tipo: **Empty Project**
- Clonar el repositorio desde la raíz del proyecto 
```
git clone https://github.com/WiscasHubble/ConversorDeMonedas.git
```

## 🛠️ **Tecnologías utilizadas**
- [**Java 17**](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html): Lenguaje principal del proyecto.
- [**ExchangeRate-API**](https://www.exchangerate-api.com/): Fuente de tasas de cambio actualizadas.
- [**Gson**](https://mvnrepository.com/artifact/com.google.code.gson/gson): Biblioteca para manejar datos JSON obtenidos desde la API.

## 🤝 **Contribuciones**

¡Contribuciones son bienvenidas! Si deseas colaborar:

1. Haz un fork del repositorio.
2. Crea una rama con tu mejora: `git checkout -b mejora-nueva-funcionalidad`.
3. Realiza un commit: `git commit -m "Añadir nueva funcionalidad"`.
4. Envía un pull request.
