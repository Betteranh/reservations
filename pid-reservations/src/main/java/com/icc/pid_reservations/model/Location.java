package com.icc.pid_reservations.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "designation", length = 60)
    private String designation;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "locality", length = 60)
    private String locality;

    @Column(name = "website", length = 255)
    private String website;

    @Column(name = "phone", length = 30)
    private String phone;

    @OneToMany(mappedBy = "location")
    private List<Representation> representations;

    protected Location() {
    }

    public Location(Integer id, String designation, String address, String locality, String website, String phone, List<Representation> representations) {
        this.id = id;
        this.designation = designation;
        this.address = address;
        this.locality = locality;
        this.website = website;
        this.phone = phone;
        this.representations = representations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Representation> getRepresentations() {
        return representations;
    }

    public void setRepresentations(List<Representation> representations) {
        this.representations = representations;
    }
}
