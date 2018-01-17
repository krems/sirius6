package io.swagger.api.factories;

import io.swagger.api.CarsApiService;
import io.swagger.api.impl.CarsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-17T10:05:03.258+03:00")
public class CarsApiServiceFactory {
    private final static CarsApiService service = new CarsApiServiceImpl();
    
    public static CarsApiService getCarsApi() {
        return service;
    }
}
