package br.com.alura.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoedas {
    Gson gson = new Gson();

    public void converterMoedas(String moeda1, String moeda2, double valor) {

        String url = "https://v6.exchangerate-api.com/v6/22539551a463879f0784fe81/pair/" + moeda1 +"/" + moeda2 + "/" + valor;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            MoedaConvertida moedaConvertida = gson.fromJson(json, MoedaConvertida.class);
            Moeda moeda = new Moeda(moedaConvertida);
            System.out.println(moeda);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
