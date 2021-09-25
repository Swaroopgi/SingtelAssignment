package com.singtel.Assignment;

public class Solution {

    public static void main(String a[])
    {
        Bird bird=new Bird();
        bird.fly();
        bird.walk();
        bird.setAnimalFeatures(new BirdFeatures());
        bird.canSing();

        Duck duck=new Duck();
        duck.setAnimalFeatures(new DuckFeatures());
        duck.setAnimalSound(new DuckSound());
        duck.getAnimalSound();
        duck.canSwim();

        Chicken chicken=new Chicken();
        chicken.setAnimalFeatures(new ChickenFeatures());
        chicken.setAnimalSound(new ChickenSound());
        chicken.getAnimalSound();
        chicken.canFly();





    }
}
