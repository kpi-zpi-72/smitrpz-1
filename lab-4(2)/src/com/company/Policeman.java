package com.company;

import java.util.UUID;

public class Policeman extends Human{
    String role;
    Policeman(UUID id) {
        super(id);
        this.role = "Firefighter";

    }
}