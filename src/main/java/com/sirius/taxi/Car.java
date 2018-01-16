package com.sirius.taxi;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @SequenceGenerator(name = "generator", sequenceName = "car_seq")
    private Integer id;
    
    private String color;
    @Column(name = "lplate")
    private String plate;
    
    @ManyToMany(mappedBy = "cars")
    private Collection<Driver> drivers;
    
    public Integer getId() {
        return id;
    }
    
    public Car setId(final Integer id) {
        this.id = id;
        return this;
    }
    
    public String getColor() {
        return color;
    }
    
    public Car setColor(final String color) {
        this.color = color;
        return this;
    }
    
    public String getPlate() {
        return plate;
    }
    
    public Car setPlate(final String plate) {
        this.plate = plate;
        return this;
    }
    
    public Collection<Driver> getDrivers() {
        return drivers;
    }
    
    public Car setDrivers(final Collection<Driver> drivers) {
        this.drivers = drivers;
        return this;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", plate='" + plate + '\'' +
                '}';
    }
}
