package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.CarsApiServiceFactory;
import io.swagger.model.Car;
import io.swagger.model.Cars;

import javax.servlet.ServletConfig;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/cars")


@io.swagger.annotations.Api(description = "the cars API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-17T00:10:11.830+03:00")
public class CarsApi {
    private final CarsApiService delegate;
    
    public CarsApi(@Context ServletConfig servletContext) {
        CarsApiService delegate = null;
        
        if (servletContext != null) {
            String implClass = servletContext.getInitParameter("CarsApi.implementation");
            if (implClass != null && !"".equals(implClass.trim())) {
                try {
                    delegate = (CarsApiService) Class.forName(implClass).newInstance();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        
        if (delegate == null) {
            delegate = CarsApiServiceFactory.getCarsApi();
        }
        
        this.delegate = delegate;
    }
    
    @GET
    
    
    @io.swagger.annotations.ApiOperation(value = "Get all available cars", notes = "Get all available cars", response = Cars.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "A list of cars", response = Cars.class)})
    public Response carsGet(@ApiParam(value = "Page number to list cars") @QueryParam("pageNumber") Integer pageNumber
            , @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.carsGet(pageNumber, securityContext);
    }
    
    @GET
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get specific car", notes = "Get car with specific id", response = Car.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "A car", response = Car.class),
            
            @io.swagger.annotations.ApiResponse(code = 404, message = "A cat doesn't exist", response = Void.class)})
    public Response carsIdGet(@ApiParam(value = "Car identifier", required = true) @PathParam("id") String id
            , @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.carsIdGet(id, securityContext);
    }
    
    @POST
    
    
    @io.swagger.annotations.ApiOperation(value = "Create Car", notes = "Create car", response = Void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "Created", response = Void.class),
            
            @io.swagger.annotations.ApiResponse(code = 400, message = "Was not created", response = Void.class)})
    public Response carsPost(@ApiParam(value = "Car") Car car
            , @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.carsPost(car, securityContext);
    }
}
