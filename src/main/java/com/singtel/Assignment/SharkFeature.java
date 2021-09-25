package com.singtel.Assignment;

public class SharkFeature extends FishFeatures implements FishQualities{

    @Override
    public void size() {
        System.out.println("Sharks are  large");
    }

    @Override
    public void color() {
        System.out.println("Sharks  are gray");
    }

    @Override
    public void habit() {
        System.out.println("Sharks eat other fish");
    }
}
