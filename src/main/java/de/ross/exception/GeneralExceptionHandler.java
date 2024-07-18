package de.ross.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class GeneralExceptionHandler implements ExceptionMapper<RuntimeException> {
    @Override
    public Response toResponse(RuntimeException e) {
        return Response.serverError().build();
    }
}
