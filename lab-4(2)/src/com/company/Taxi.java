package com.company;

public class Taxi extends Vehicle<Human>{
    Taxi(Integer capacity) { super(capacity);}
    public void insertPassenger(Human passenger) {
        if(this.freeSeats > 0) {
            this.freeSeats -= 1;
            this.passengers.add(passenger);
        } throw new Error("Vehicle capacity exceeded");
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
