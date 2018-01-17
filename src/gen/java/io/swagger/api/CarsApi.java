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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-17T10:00:02.220+03:00")
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


    @io.swagger.annotations.ApiOperation(value = "Get all cars", notes = "Get all cars", response = Cars.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "All available cars", response = Cars.class)})
    public Response carsGet(@ApiParam(value = "Number of cars per page", required = true) @PathParam("pageSize") Integer pageSize
            , @ApiParam(value = "Page number", required = true) @PathParam("pageNumber") Integer pageNumber
            , @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.carsGet(pageSize, pageNumber, securityContext);
    }
    
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a car", notes = "Deletes car with id", response = Void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
            
            @io.swagger.annotations.ApiResponse(code = 404, message = "Not found", response = Void.class)})
    public Response carsIdDelete(@ApiParam(value = "Car identificator", required = true) @PathParam("id") Integer id
            , @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.carsIdDelete(id, securityContext);
    }
    @GET
    @Path("/{id}")


    @io.swagger.annotations.ApiOperation(value = "Get a car", notes = "Get car by id", response = Car.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "A car", response = Car.class),
        
            @io.swagger.annotations.ApiResponse(code = 404, message = "Not found", response = Void.class)})
    public Response carsIdGet(@ApiParam(value = "Car identificator", required = true) @PathParam("id") Integer id
            , @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.carsIdGet(id, securityContext);
    }
    @POST


    @io.swagger.annotations.ApiOperation(value = "Create a car", notes = "Create a car", response = Void.class, tags = {})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = Void.class),
        
            @io.swagger.annotations.ApiResponse(code = 400, message = "Couldn't create car", response = Void.class)})
    public Response carsPost(@ApiParam(value = "A car") Car car
            , @Context SecurityContext securityContext)
            throws NotFoundException {
        return delegate.carsPost(car, securityContext);
    }
}
