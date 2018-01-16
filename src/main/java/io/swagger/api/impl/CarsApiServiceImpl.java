package io.swagger.api.impl;

import io.swagger.api.ApiResponseMessage;
import io.swagger.api.CarsApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.Car;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-17T00:10:11.830+03:00")
public class CarsApiServiceImpl extends CarsApiService {
    @Override
    public Response carsGet(Integer pageNumber, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response carsIdGet(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response carsPost(Car car, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
