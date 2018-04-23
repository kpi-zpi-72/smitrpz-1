package com.company;

public class Car extends Vehicle implements Navigator<Citizen>{
    Car(Integer capacity) { super(capacity);}
    public void insertPassenger(Citizen passenger) {
    }
    public void ejectPassenger(Citizen passenger) {
    }
}
