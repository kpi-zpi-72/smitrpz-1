package com.company;

import com.company.Human;

import java.util.ArrayList;

public class Vehicle {
    Integer capacity;
    Integer freeSeats;
    ArrayList passengers;
    Vehicle(Integer capacity) {
        this.capacity = capacity;
        this.freeSeats = capacity;
        this.passengers = new ArrayList(capacity);
    }

    public Integer getCapacity() {
        return this.capacity;
    }
    public Boolean hasFreeSeats() {
        return this.freeSeats > 0;
    }
    public void insertPassenger(Human passenger) {
    if(this.hasFreeSeats()) {
        this.passengers.add(passenger);
        this.freeSeats -= 1;
    } else throw new Error("No more free seats");
    }
}
