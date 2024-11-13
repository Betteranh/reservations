package com.icc.pid_reservations.model;

import jakarta.persistence.*;

@Entity
@Table(name="artiste_types")
public class ArtisteType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    protected ArtisteType() {
    }

    public ArtisteType(Integer id, Artist artist, Type type) {
        this.id = id;
        this.artist = artist;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
