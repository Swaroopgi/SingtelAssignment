package com.singtel.Assignment;

public class ClowFeature extends FishFeatures implements FishQualities{

    @Override
    public void size() {
        System.out.println("Clownfish are  small");
    }

    @Override
    public void color() {
        System.out.println("Clownfish  are orange");
    }

    @Override
    public void habit() {
        System.out.println("Clownfish make jokes");
    }
}
