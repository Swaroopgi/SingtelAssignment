package com.singtel.Assignment;

public class DuckSound implements AnimalSound {
    @Override
    public String sound() {
        System.out.println("Quack,quack");
        return "Quack ,quack";
    }
}
