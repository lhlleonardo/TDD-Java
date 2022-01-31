package com.leonardo.springtdd.model;

import java.time.LocalDate;

public class Booking {

    private String id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Integer numgerGuests;

    public Booking() {
    }

    public Booking(String id, String reserveName, LocalDate checkIn, LocalDate checkOut, Integer numgerGuests) {
        this.id = id;
        this.reserveName = reserveName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numgerGuests = numgerGuests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReserveName() {
        return reserveName;
    }

    public void setReserveName(String reserveName) {
        this.reserveName = reserveName;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Integer getNumgerGuests() {
        return numgerGuests;
    }

    public void setNumgerGuests(Integer numgerGuests) {
        this.numgerGuests = numgerGuests;
    }
}
