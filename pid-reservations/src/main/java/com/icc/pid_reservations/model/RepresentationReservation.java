package com.icc.pid_reservations.model;

import jakarta.persistence.*;

@Entity
@Table(name="representation_reservation")
public class RepresentationReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "representation_id")
    private Representation representation;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "price_id")
    private Price price;

    @Column(name = "quantity")
    private Byte quantity;

    protected RepresentationReservation() {
    }

    public RepresentationReservation(Integer id, Representation representation, Reservation reservation, Price price, Byte quantity) {
        this.id = id;
        this.representation = representation;
        this.reservation = reservation;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Representation getRepresentation() {
        return representation;
    }

    public void setRepresentation(Representation representation) {
        this.representation = representation;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Byte getQuantity() {
        return quantity;
    }

    public void setQuantity(Byte quantity) {
        this.quantity = quantity;
    }
}
