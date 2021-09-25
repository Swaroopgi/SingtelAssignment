package com.singtel.Assignment;

public class Animal {
    protected AnimalFeatures animalFeatures=null;
    protected AnimalSound animalSound;
    void walk(){
        System.out.println("I am walking");
    }

    public void setAnimalFeatures(AnimalFeatures animalFeatures) {
        this.animalFeatures = animalFeatures;
    }
    public void setAnimalSound(AnimalSound animalSound) {
        this.animalSound = animalSound;
    }

    public boolean canSing()
    {
        return animalFeatures.canSing();
    }
    public boolean canWalk()
    {
        return animalFeatures.canWalk();
    }
    public boolean canSwim()
    {
        return animalFeatures.canSwim();
    }
    public boolean canFly()
    {
        return animalFeatures.canFly();
    }
    public String getAnimalSound()
    {
        return animalSound.sound();
    }

}
