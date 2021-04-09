package com.example.ayaro.Lab2Agency;

import com.example.ayaro.Lab2Agency.models.Flat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/agency")
public class AgencyResource {

    @GET
    @Path("/ping")
    @Produces("text/plain")
    public Response ping() {
        return  Response.status(200).entity("pong").build();
    }

    @GET
    @Path("/get-cheapest/{id1}/{id2}")
    @Produces("application/json")
    public Response hello(@PathParam("id1") long id1, @PathParam("id2") long id2) {
        try {

            Response response1 = FlatClient.getFlatByID(id1);
            if (response1.getStatus() == 404) {
                return Response.status(404).build();
            }
            if (response1.getStatus() != 200) {
                return Response.status(500).build();
            }
            Flat flat1 = response1.readEntity(Flat.class);

            Response response2 = FlatClient.getFlatByID(id2);
            if (response2.getStatus() == 404) {
                return Response.status(404).build();
            }
            if (response2.getStatus() != 200) {
                return Response.status(500).build();
            }
            Flat flat2 = response2.readEntity(Flat.class);

            if (flat1.getPrice() < flat2.getPrice()) {
                return Response.status(200).entity(flat1).build();
            }
            return Response.status(200).entity(flat2).build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Response.status(500).build();
        }
    }

    @GET
    @Path("/get-most-expensive/{id1}/{id2}/{id3}")
    @Produces("application/json")
    public Response hello(@PathParam("id1") long id1, @PathParam("id2") long id2,  @PathParam("id3") long id3) {
        try {

            Response response1 = FlatClient.getFlatByID(id1);
            if (response1.getStatus() == 404) {
                return Response.status(404).build();
            }
            Flat flat1 = response1.readEntity(Flat.class);

            Response response2 = FlatClient.getFlatByID(id2);
            if (response2.getStatus() == 404) {
                return Response.status(404).build();
            }
            Flat flat2 = response2.readEntity(Flat.class);

            Response response3 = FlatClient.getFlatByID(id3);
            if (response3.getStatus() == 404) {
                return Response.status(404).build();
            }
            Flat flat3 = response3.readEntity(Flat.class);

            Flat expFlat;
            if (flat1.getPrice() > flat2.getPrice()) {
                expFlat = flat1;
            } else {
                expFlat = flat2;
            }

            if (expFlat.getPrice() > flat3.getPrice()) {
                return Response.status(200).entity(expFlat).build();
            }
            return Response.status(200).entity(flat3).build();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Response.status(500).build();
        }
    }
}
