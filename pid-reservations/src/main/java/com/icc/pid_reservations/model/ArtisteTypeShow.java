package com.icc.pid_reservations.model;

import jakarta.persistence.*;

@Entity
@Table(name="artiste_type_show")
public class ArtisteTypeShow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "artiste_type_id")
    private ArtisteType artisteType;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    protected ArtisteTypeShow() {
    }

    public ArtisteTypeShow(Integer id, ArtisteType artisteType, Show show) {
        this.id = id;
        this.artisteType = artisteType;
        this.show = show;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArtisteType getArtisteType() {
        return artisteType;
    }

    public void setArtisteType(ArtisteType artisteType) {
        this.artisteType = artisteType;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
