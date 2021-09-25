package com.singtel.Assignment;

public class Fish extends Animal{

    private FishQualities fishQualities=null;


    public void setFishQualities(FishQualities fishQualities) {
        this.fishQualities = fishQualities;
    }

    public void size()
    {
        fishQualities.size();
    }
    public void color()
    {
        fishQualities.color();
    }
    public void habit()
    {
        fishQualities.habit();
    }
}
