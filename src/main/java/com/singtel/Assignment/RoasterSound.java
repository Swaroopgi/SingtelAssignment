package com.singtel.Assignment;

public class RoasterSound implements AnimalSound {
    @Override
    public String sound() {
        System.out.println("Cock-a-doodle-doo ");
        return "Cock-a-doodle-doo";
    }
}
