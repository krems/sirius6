package com.sirius.taxi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum PersistenceUnit {
    INSTANCE;
    
    private final EntityManagerFactory factory;
    
    PersistenceUnit() {
        this.factory = Persistence.createEntityManagerFactory("com.sirius.taxi");
    }
    
    public EntityManager get() {
        return this.factory.createEntityManager();
    }
    
    public void close() {
        this.factory.close();
    }
}
