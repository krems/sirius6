package com.sirius.taxi;

import javax.persistence.*;

@Entity
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @SequenceGenerator(name = "generator", sequenceName = "ride_seq")
    private int id;
    @ManyToOne
    @JoinColumn(name = "driver")
    private Driver driver;
    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "car")
    private Car car;
    private long duration;
    
    
    public int getId() {
        return id;
    }
    
    public Ride setId(final int id) {
        this.id = id;
        return this;
    }
    
    public Driver getDriver() {
        return driver;
    }
    
    public Ride setDriver(final Driver driver) {
        this.driver = driver;
        return this;
    }
    
    public Client getClient() {
        return client;
    }
    
    public Ride setClient(final Client client) {
        this.client = client;
        return this;
    }
    
    public long getDuration() {
        return duration;
    }
    
    public Ride setDuration(final long duration) {
        this.duration = duration;
        return this;
    }
    
    public Car getCar() {
        return car;
    }
    
    public Ride setCar(final Car car) {
        this.car = car;
        return this;
    }
    
    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                ", driver=" + driver +
                ", client=" + client +
                ", car=" + car +
                ", duration=" + duration +
                '}';
    }
}
