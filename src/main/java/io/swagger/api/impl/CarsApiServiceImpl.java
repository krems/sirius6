package io.swagger.api.impl;

import com.sirius.taxi.CarsDao;
import io.swagger.api.ApiResponseMessage;
import io.swagger.api.CarsApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.Car;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.List;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-17T10:05:03.258+03:00")
public class CarsApiServiceImpl extends CarsApiService {
    @Override
    public Response carsGet(Integer pageSize, Integer pageNumber, SecurityContext securityContext) throws NotFoundException {
        final List<com.sirius.taxi.model.Car> cars = CarsDao.findAllCars();
        final List<Car> result = cars.stream().map(car -> car.toWebModel()).collect(Collectors.toList());
        return Response.ok().entity(result).build();
    }
    @Override
    public Response carsIdDelete(Integer id, SecurityContext securityContext) throws NotFoundException {
        CarsDao.deleteCar(id);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Delete")).build();
    }
    
    @Override
    public Response carsIdGet(Integer id, SecurityContext securityContext) throws NotFoundException {
        final com.sirius.taxi.model.Car car = CarsDao.findCar(id);
        return Response.ok().entity(car.toWebModel()).build();
    }
    
    @Override
    public Response carsPost(Car car, SecurityContext securityContext) throws NotFoundException {
        CarsDao.createCar(car);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Created")).build();
    }
}
