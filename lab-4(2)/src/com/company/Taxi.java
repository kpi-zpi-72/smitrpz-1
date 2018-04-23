package com.company;

public class Taxi extends Vehicle implements Navigator<Human>{
    Taxi(Integer capacity) { super(capacity);}
    public void insertPassenger(Human passenger) {
    }
    public void ejectPassenger(Human passenger) {
    }
}
