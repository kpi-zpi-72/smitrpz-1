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
        this.passengers = new ArrayList<Human>(capacity);
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

    public void ejectPassenger(Human passenger) {
        int passengerIndex = this.passengers.indexOf(passenger);
        if(passengerIndex == -1) {
            throw new Error("Passenger is not on board");
        } else {
            this.passengers.remove(passengerIndex);
            this.freeSeats += 1;
        }
    }
}
