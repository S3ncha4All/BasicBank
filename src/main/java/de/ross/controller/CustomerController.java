package de.ross.controller;

import de.ross.service.CustomerService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/customers")
public class CustomerController {

    @Inject
    CustomerService customerService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAllCustomers() {
        customerService.loadAllCustomers();
        return Response.ok().build();
    }
}
