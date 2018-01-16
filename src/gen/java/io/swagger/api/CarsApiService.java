package io.swagger.api;

import io.swagger.model.Car;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-17T00:10:11.830+03:00")
public abstract class CarsApiService {
    public abstract Response carsGet(Integer pageNumber, SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response carsIdGet(String id, SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response carsPost(Car car, SecurityContext securityContext) throws NotFoundException;
}
