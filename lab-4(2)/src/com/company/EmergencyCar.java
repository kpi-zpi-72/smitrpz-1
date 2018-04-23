package com.company;

public class EmergencyCar extends  Vehicle implements Navigator <Policeman>{
    EmergencyCar(Integer capacity) {
        super(capacity);
    }
    public void insertPassenger(Policeman passenger) {
    }
    public void ejectPassenger(Policeman passenger) {
    }
}
