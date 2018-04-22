package com.company;

public interface PassengerNavigator<T> {
    Boolean hasFreeSeats();

    default void insertPassenger(T passenger) {

    }
}
