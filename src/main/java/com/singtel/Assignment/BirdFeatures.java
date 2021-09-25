package com.singtel.Assignment;

public class BirdFeatures implements AnimalFeatures{

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canSing() {

        System.out.println("Bird Can Sing");
        return true;
    }

}
