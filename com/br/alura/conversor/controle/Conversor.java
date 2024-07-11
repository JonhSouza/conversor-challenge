package com.br.alura.conversor.controle;

import com.br.alura.conversor.modelos.Moeda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/17ce5e331cb1136dfcc30e50/pair/";

    public void iniciarConversao(String moeda1, String moeda2, double valor) throws IOException, InterruptedException {

        String url = BASE_URL + moeda1.toUpperCase() + "/" + moeda2.toUpperCase() + "/" + valor;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            Moeda moeda = new Gson().fromJson(response.body(), Moeda.class);
            System.out.println(moeda);
        } else {
            System.out.println("Erro na consulta da API. Status code: " + response.statusCode());
        }

    }




}
