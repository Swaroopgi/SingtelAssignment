package com.singtel.Assignment;

public class ButterFlyFeature implements AnimalFeatures {


    @Override
    public boolean canFly() {
        System.out.println("ButterFly Can Fly");
        return true;
    }

    @Override
    public boolean canWalk() {
        System.out.println("ButterFly Can't walk");
        return false;
    }

    @Override
    public boolean canSwim() {
        System.out.println("ButterFly Can't swim");
        return false;
    }

    @Override
    public boolean canSing() {
        System.out.println("ButterFly Can Sing");
        return true;
    }


}
