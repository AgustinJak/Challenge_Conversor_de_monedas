Este proyecto es una aplicación de consola desarrollada en Java que permite convertir montos entre diferentes monedas utilizando la ExchangeRate-API.
Funcionalidades
Conversión entre:
Dólar estadounidense (USD) y Peso argentino (ARS)
USD y Real brasileño (BRL)
USD y Peso colombiano (COP)
Y viceversa
Consulta de tasas de cambio actualizadas en tiempo real.
Manejo de errores de entrada (valida que el usuario ingrese números válidos).

🔹 Menu.java
Responsabilidad principal:
Actúa como la interfaz de usuario en consola. Se encarga de mostrar el menú, recibir las entradas del usuario, validar datos, e invocar la lógica de conversión.
Funciones clave:
Muestra las opciones de conversión disponibles.
Solicita al usuario el monto a convertir.
Controla errores de entrada como valores no numéricos.
Llama a ConexionApi para obtener las tasas de conversión.
Calcula e imprime el resultado de la conversión

-----------------------------------------------------------

🔹 ConexionApi.java
Responsabilidad principal:
Se encarga de conectarse a la API externa de tipos de cambio y transformar la respuesta JSON en un objeto Java.
Funciones clave:
Crea una solicitud HTTP a la ExchangeRate API.
Usa HttpClient (nativo de Java 11+) para enviar la petición.
Parsea la respuesta JSON usando la biblioteca Gson.
Devuelve una instancia de la clase Conversor con los datos cargados.

-----------------------------------------------------------

🔹 Conversor.java
Responsabilidad principal:
Sirve como modelo de datos (DTO) para representar la respuesta de la API. Contiene las tasas de conversión para una moneda base.


Como usar:
Primero elegimos una opcion en el menu:

![image](https://github.com/user-attachments/assets/63deb2cf-4c86-4330-94d8-8cc913ccdeae)

Segundo, Elegimos el monto a convertir:

![image](https://github.com/user-attachments/assets/b56d2c38-f238-4d9a-83ec-bd4386786012)

Y por ultimo da el resultado y elegimnos si seguir convirtiendo o salirnos

![image](https://github.com/user-attachments/assets/61c6de39-c776-4425-9908-424613380375)


