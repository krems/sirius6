package com.sirius.taxi;


import com.sirius.taxi.model.Car;

import javax.persistence.EntityManager;
import java.util.List;

public class CarsDao {
    
    public static List<Car> findAllCars() {
        final EntityManager manager = PersistenceUnit.INSTANCE.get();
        final List<Car> result = manager.createQuery("from Car", Car.class).getResultList();
        manager.close();
        return result;
    }
    
    public static Car findCar(final int id) {
        final EntityManager manager = PersistenceUnit.INSTANCE.get();
        final Car result = manager.find(Car.class, id);
        manager.close();
        return result;
    }
    
    public static void createCar(final io.swagger.model.Car car) {
        final EntityManager manager = PersistenceUnit.INSTANCE.get();
        manager.getTransaction().begin();
        manager.persist(Car.fromWebModel(car));
        manager.getTransaction().commit();
        manager.close();
    }
    
    public static void updateCar(final int id, final io.swagger.model.Car car) {
        final EntityManager manager = PersistenceUnit.INSTANCE.get();
        manager.getTransaction().begin();
        final Car result = manager.find(Car.class, id);
        final Car updatedCar = result
                .setColor(car.getColor())
                .setPlate(car.getPlate());
        manager.persist(updatedCar);
        manager.getTransaction().commit();
        manager.close();
    }
    
    public static void deleteCar(final int id) {
        final EntityManager manager = PersistenceUnit.INSTANCE.get();
        manager.getTransaction().begin();
        final Car car = manager.find(Car.class, id);
        manager.remove(car);
        manager.getTransaction().commit();
        manager.close();
    }
}
