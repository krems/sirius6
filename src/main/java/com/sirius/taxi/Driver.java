package com.sirius.taxi;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @SequenceGenerator(name = "generator", sequenceName = "driver_seq")
    private int id;
    @OneToOne
    @JoinColumn(name = "license")
    private License license;
    
    @ManyToMany
    private Collection<Car> cars;
    
    public int getId() {
        return id;
    }
    
    public Driver setId(final int id) {
        this.id = id;
        return this;
    }
    
    public License getLicense() {
        return license;
    }
    
    public Driver setLicense(final License license) {
        this.license = license;
        return this;
    }
    
    public Collection<Car> getCars() {
        return cars;
    }
    
    public Driver setCars(final Collection<Car> cars) {
        this.cars = cars;
        return this;
    }
    
    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", license=" + license +
                ", cars=" + cars +
                '}';
    }
}
