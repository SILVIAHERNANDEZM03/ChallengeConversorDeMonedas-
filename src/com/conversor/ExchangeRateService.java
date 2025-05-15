package com.conversor;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateService {
    private static final String API_KEY = "812ae5af07a072d16677b5f1";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double obtenerTasaCambio(String monedaBase, String monedaObjetivo) {
        String endpoint = BASE_URL + API_KEY + "/latest/" + monedaBase;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endpoint))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

            return conversionRates.get(monedaObjetivo).getAsDouble();
        } catch (Exception e) {
            System.out.println("Error al obtener los datos de la API: " + e.getMessage());
            return -1;
        }
    }
}
