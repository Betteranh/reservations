package com.icc.pid_reservations.model;

import jakarta.persistence.*;

@Entity
@Table(name="localities")
public class Locality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "postal_code", length = 6)
    private String postalCode;

    @Column(name = "locality", length = 60)
    private String locality;

    protected Locality() {
    }

    public Locality(Integer id, String postalCode, String locality) {
        this.id = id;
        this.postalCode = postalCode;
        this.locality = locality;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }
}
