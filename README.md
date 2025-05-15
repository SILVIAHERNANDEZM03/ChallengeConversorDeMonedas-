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
- Ingresa la cantidad a convertir.
- Se obtiene la tasa de cambio en tiempo real desde la API.
- Se realiza la conversión y se muestra el resultado.
- Si el usuario elige salir, el programa termina con un mensaje de agradecimiento.

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

- **Silvia Hernández**
- Repositorio: [ChallengeConversorDeMonedas](https://github.com/SILVIAHERNANDEZM03/ChallengeConversorDeMonedas)

---

## 🚀 Ejecución

1. Clona el repositorio:
   ```
   git clone https://github.com/SILVIAHERNANDEZM03/ChallengeConversorDeMonedas.git
   ```
2. Abre el proyecto con tu IDE favorito (como IntelliJ o VSCode con soporte Java).
3. Ejecuta la clase `Main.java`.
