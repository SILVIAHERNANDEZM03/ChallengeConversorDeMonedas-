# 💱 Challenge: Conversor de Monedas

Este proyecto es un desafío de programación que consiste en desarrollar una aplicación Java que permite convertir monedas usando una API externa para obtener tasas de cambio en tiempo real. Se hace uso de `HttpClient`, `HttpRequest`, `HttpResponse` y la biblioteca `Gson` para el análisis del JSON recibido.

---

## 🛠️ Requisitos y Configuración

- Java 11 o superior
- Conexión a internet (para consultar la API)
- API utilizada: [ExchangeRate API](https://www.exchangerate-api.com/)

---

## ⚙️ Estructura del Proyecto

1. **Configuración del Ambiente Java**
2. **Creación del Proyecto**
3. **Consumo de la API** con `HttpClient`
4. **Análisis del JSON** con `Gson`
5. **Filtrado de Monedas**
6. **Conversión y Lógica**
7. **Interfaz de Usuario en Consola**

---

## 🌍 Monedas Incluidas

El conversor permite realizar conversiones entre las siguientes monedas:

- USD → BRL (Dólar → Real brasileño)
- USD → CLP (Dólar → Peso chileno)
- USD → COP (Dólar → Peso colombiano)
- BRL → USD (Real brasileño → Dólar)
- CLP → USD (Peso chileno → Dólar)
- COP → USD (Peso colombiano → Dólar)

---

## 🧠 Funcionamiento

- El usuario selecciona una opción del menú numérico.


![image](https://github.com/user-attachments/assets/c793439c-8362-40b9-831b-b40631a58a38)



- Ingresa la cantidad a convertir.
- Se obtiene la tasa de cambio en tiempo real desde la API.
- Se realiza la conversión y se muestra el resultado.


![image](https://github.com/user-attachments/assets/c32f4f9d-13f8-4b26-959a-88f86504dade)


- Si el usuario elige salir, el programa termina con un mensaje de agradecimiento.


![image](https://github.com/user-attachments/assets/1ca07607-7051-4121-8deb-1f09673c670e)


- El usuario debe seleccionar una opción del 1 al 7. Si el usuario ingresa un número fuera del rango (por ejemplo, 0 u 8), el programa muestra un mensaje de advertencia indicando que debe elegir una opción válida del menú.


![image](https://github.com/user-attachments/assets/9b03c03b-f89b-4495-8bf6-b0517c8fdb7f)


-No se aceptan cantidades iguales o menores a cero. Si el usuario ingresa un número negativo o cero, el programa lo notifica y vuelve a solicitar un valor válido.


![image](https://github.com/user-attachments/assets/064a1d2d-0dac-4b15-8dd4-be12cee9ebed)


Además, se manejan errores como:
- Opción inválida
- Fallos en la API
- Monedas no soportadas

---

## 📦 Librerías Utilizadas

- `java.net.http.HttpClient`
- `com.google.gson.Gson`
- `java.util.Scanner`

---

## 👤 Autora

- Alumna de Alura Latam G8: Silvia Hernández Márquez.


---

## 🚀 Ejecución

1. Clona el repositorio:
   ```
   git clone https://github.com/SILVIAHERNANDEZM03/ChallengeConversorDeMonedas-.git
   ```
2. Abre el proyecto con tu IDE favorito (como IntelliJ o VSCode con soporte Java).
3. Ejecuta la clase `Main.java`.
