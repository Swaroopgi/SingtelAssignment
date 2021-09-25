package com.singtel.Assignment;

public class DuckFeatures implements AnimalFeatures{


    @Override
    public boolean canFly() {
        System.out.println("Duck Can't Fly");
        return false;
    }

    @Override
    public boolean canWalk() {
        System.out.println("Duck Can walk");
        return true;
    }

    @Override
    public boolean canSwim() {
        System.out.println("Duck Can swim");
        return true;
    }

    @Override
    public boolean canSing() {
        //System.out.println("Duck Can't Sing");
        return false;
    }
}
