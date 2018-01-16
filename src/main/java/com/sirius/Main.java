package com.sirius;


import com.sirius.taxi.Car;
import com.sirius.taxi.Driver;
import com.sirius.taxi.License;
import com.sirius.taxi.Ride;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {
    private static final EntityManagerFactory factory;
    
    static {
        factory = Persistence.createEntityManagerFactory("com.sirius.taxi");
    }
    
    public static void main(String[] args) throws Exception {
        createNewDriver(1, 1);
        //        dropCar(1);
        factory.close();
    }
    
    private static void createNewDriver(final int carId, final int licenseId) {
        final EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        final Set<Car> cars = Collections.singleton(findCar(carId));
        final License license = findLicense(licenseId);
        final Driver driver = new Driver().setCars(cars).setLicense(license);
        manager.persist(driver);
        manager.getTransaction().commit();
        manager.close();
    }
    
    private static void dropCar(final int id) {
        final EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        final Car car = manager.find(Car.class, id);
        manager.remove(car);
        manager.getTransaction().commit();
        manager.close();
    }
    
    private static void printAllRides() {
        final EntityManager manager = factory.createEntityManager();
        final List<Ride> result = manager.createQuery("from Ride", Ride.class).getResultList();
        for (final Ride ride : result) {
            System.out.println(ride);
        }
        manager.close();
    }
    
    private static Car findCar(final int id) {
        final EntityManager manager = factory.createEntityManager();
        final Car result = manager.find(Car.class, id);
        manager.close();
        return result;
    }
    
    private static License findLicense(final int id) {
        final EntityManager manager = factory.createEntityManager();
        final License result = manager.find(License.class, id);
        manager.close();
        return result;
    }
    
    private static void saveCar() {
        final EntityManager manager = factory.createEntityManager();
        final Car car = new Car().setColor("grey").setPlate("A000AA00");
        manager.getTransaction().begin();
        manager.persist(car);
        manager.getTransaction().commit();
        manager.close();
    }
}
