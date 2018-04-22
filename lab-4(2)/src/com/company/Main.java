package com.company;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Integer capacity = 5;
        Integer counter;
        EmergencyCar myFirstVehicle = new EmergencyCar(capacity);
        for(counter = 0; counter < capacity; counter++) {
            // write your code here
            UUID uuid = UUID.randomUUID();
            Policeman genericPassenger = new Policeman(uuid);
            myFirstVehicle.insertPassenger(genericPassenger);
        }

    }
}
