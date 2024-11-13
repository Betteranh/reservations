package com.icc.pid_reservations.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="representations")
public class Representation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    @Column(name = "schedule")
    private LocalDateTime schedule;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany(mappedBy = "representation")
    private List<RepresentationReservation> reservations;

    protected Representation() {
    }

    public Representation(Integer id, Show show, LocalDateTime schedule, Location location, List<RepresentationReservation> reservations) {
        this.id = id;
        this.show = show;
        this.schedule = schedule;
        this.location = location;
        this.reservations = reservations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public LocalDateTime getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalDateTime schedule) {
        this.schedule = schedule;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<RepresentationReservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<RepresentationReservation> reservations) {
        this.reservations = reservations;
    }
}
