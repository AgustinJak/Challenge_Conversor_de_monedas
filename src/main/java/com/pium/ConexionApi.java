package com.pium;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {

    public Conversor conectar(String monedaBase) {
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/f9b97ac9f8383aab9892b51f/latest/" + monedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al conectar con la API", e);
        }
    }
}
