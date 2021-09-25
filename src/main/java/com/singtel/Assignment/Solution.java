package com.singtel.Assignment;

import java.util.Arrays;

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

        Roaster roaster=new Roaster();
        roaster.setAnimalSound(new RoasterSound());
        roaster.getAnimalSound();

        Shark shark=new Shark();
        shark.setFishQualities(new SharkFeature());
        shark.size();
        shark.color();
        shark.habit();

       ClownFish clownFish=new ClownFish();
       clownFish.setFishQualities(new ClowFeature());
       clownFish.size();

       clownFish.color();
       clownFish.habit();

       Caterpillar caterpillar=new Caterpillar();
       caterpillar.setAnimalFeatures(new CaterpillarFeature());
       caterpillar.canFly();
       caterpillar.canSing();



    }
}
