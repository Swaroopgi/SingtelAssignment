package com.singtel.Assignment;

public class Animal {
    protected AnimalFeatures animalFeatures=null;
    void walk(){
        System.out.println("I am walking");
    }

    public void setAnimalFeatures(AnimalFeatures animalFeatures) {
        this.animalFeatures = animalFeatures;
    }

    public boolean canSing()
    {
        return animalFeatures.canSing();
    }

}
