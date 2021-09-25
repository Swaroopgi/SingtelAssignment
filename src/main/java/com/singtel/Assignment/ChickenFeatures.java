package com.singtel.Assignment;

public class ChickenFeatures implements AnimalFeatures{


    @Override
    public boolean canFly() {
        System.out.println("Chicken Can't Fly");
        return false;
    }

    @Override
    public boolean canWalk() {
        System.out.println("Chicken Can walk");
        return true;
    }

    @Override
    public boolean canSwim() {
        System.out.println("Chicken Can't swim");
        return true;
    }

    @Override
    public boolean canSing() {
        //System.out.println("Chicken Can't Sing");
        return false;
    }
}
