package com.icc.pid_reservations.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="types")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type", length = 60)
    private String type;

    @ManyToMany(mappedBy = "types")
    private List<Artist> artists;

    protected Type() {
    }

    public Type(Integer id, String type, List<Artist> artists) {
        this.id = id;
        this.type = type;
        this.artists = artists;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
}
