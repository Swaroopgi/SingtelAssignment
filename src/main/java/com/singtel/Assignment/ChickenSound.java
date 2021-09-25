package com.singtel.Assignment;

public class ChickenSound implements AnimalSound {
    @Override
    public String sound() {
        System.out.println("Cluck,Cluck");
        return "Cluck ,Cluck";
    }
}
