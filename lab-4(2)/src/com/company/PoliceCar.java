package com.company;

public class PoliceCar extends Vehicle implements  Navigator <Policeman>{
    PoliceCar(Integer capacity) {
        super(capacity);
    }
    public void insertPassenger(Policeman passenger) {
    }
    public void ejectPassenger(Policeman passenger) {
    }
}
