package com.singtel.Assignment;

public class CaterpillarFeature implements AnimalFeatures {


    @Override
    public boolean canFly() {
        System.out.println("Caterpillar Can't Fly");
        return false;
    }

    @Override
    public boolean canWalk() {
        System.out.println("Caterpillar Can walk");
        return false;
    }

    @Override
    public boolean canSwim() {
        System.out.println("Caterpillar Can't swim");
        return false;
    }

    @Override
    public boolean canSing() {
        System.out.println("Caterpillar Can't Sing");
        return false;
    }


}
