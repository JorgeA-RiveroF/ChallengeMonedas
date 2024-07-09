package com.challengemonedas.servicio;

import com.challengemonedas.modelo.Moneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    public Moneda conversionMoneda (String monedaReferencia, String monedaCambio, double cantidad){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a7391a114d1f16e346e74e07/pair/"+ monedaReferencia + "/" + monedaCambio + "/" + cantidad);
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            HttpResponse<String> response = null;

            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("Hubo un error en la operación");
        }
    }

}
