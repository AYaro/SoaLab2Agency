package com.example.ayaro.Lab2Agency;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class FlatClient {
    private static final Client client = ClientBuilder.newBuilder().build();

    private static String flatURL = System.getenv("FLAT_URL");

    public static Response getFlatByID(long id) {
        return client.target(flatURL + "/flats/" + id).request(MediaType.APPLICATION_JSON).get();
    }
}
