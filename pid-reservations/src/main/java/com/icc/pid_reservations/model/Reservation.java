package com.icc.pid_reservations.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "booking_date")
    private LocalDateTime bookingDate;

    @Column(name = "status", length = 60)
    private String status;

    @OneToMany(mappedBy = "reservation")
    private List<RepresentationReservation> representationReservations;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    protected Reservation() {
    }

    public Reservation(Integer id, LocalDateTime bookingDate, String status, List<RepresentationReservation> representationReservations, User user) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.status = status;
        this.representationReservations = representationReservations;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<RepresentationReservation> getRepresentationReservations() {
        return representationReservations;
    }

    public void setRepresentationReservations(List<RepresentationReservation> representationReservations) {
        this.representationReservations = representationReservations;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
