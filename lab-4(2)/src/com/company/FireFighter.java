package com.company;

import java.util.UUID;

public class FireFighter extends Human{
    String role;
    FireFighter(UUID id) {
        super(id);
        this.role = "Firefighter";

    }
}
