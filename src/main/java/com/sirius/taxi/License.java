package com.sirius.taxi;

import javax.persistence.*;

@Entity
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @SequenceGenerator(name = "generator", sequenceName = "license_seq")
    private int id;
    private String code;
    
    public int getId() {
        return id;
    }
    
    public License setId(final int id) {
        this.id = id;
        return this;
    }
    
    public String getCode() {
        return code;
    }
    
    public License setCode(final String code) {
        this.code = code;
        return this;
    }
    
    @Override
    public String toString() {
        return "License{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
