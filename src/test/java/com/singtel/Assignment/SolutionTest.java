package com.singtel.Assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Bird bird;
    private Duck duck;
    private Chicken chicken;
    private Roaster roaster;

    @Before
    public void setup(){
        bird=new Bird();
        duck=new Duck();
        chicken=new Chicken();
        roaster=new Roaster();
    }
    @Test
    public void question1()
    {
        bird.setAnimalFeatures(new BirdFeatures());
        Assert.assertTrue(bird.canSing());
    }

    @Test
    public void question2()
    {
        duck.setAnimalSound(new DuckSound());
        duck.setAnimalFeatures(new DuckFeatures());
        Assert.assertEquals("Quack ,quack",duck.getAnimalSound());
        Assert.assertTrue(duck.canSwim());
    }

    @Test
    public void question3()
    {
        roaster.setAnimalSound(new RoasterSound());
        Assert.assertEquals("Cock-a-doodle-doo",roaster.getAnimalSound());
    }

}
