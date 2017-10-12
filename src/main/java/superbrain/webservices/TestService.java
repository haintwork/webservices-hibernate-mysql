/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superbrain.webservices;

import com.google.gson.JsonObject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author haing
 */
@Path("/test")
public class TestService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TestService
     */
    public TestService() {
    }

    /**
     * Retrieves representation of an instance of superbrain.webservices.TestService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String get() {
        return "Service is working fine!";
    }
    
    @GET
    @Path("/getJson")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        JsonObject json = new JsonObject();
        json.addProperty("message", "Get Json Success!");
        return json.toString();
    }

    /**
     * PUT method for updating or creating an instance of TestService
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
