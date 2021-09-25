package com.singtel.Assignment;

public abstract class FishFeatures implements AnimalFeatures {


    @Override
    public boolean canFly() {
        System.out.println("Fish Can't Fly");
        return false;
    }

    @Override
    public boolean canWalk() {
        System.out.println("Duck Can't walk");
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
