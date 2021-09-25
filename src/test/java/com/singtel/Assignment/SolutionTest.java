package com.singtel.Assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Bird bird;

    @Before
    public void setup(){
        bird=new Bird();
    }
    @Test
    public void question1()
    {
        bird.setAnimalFeatures(new BirdFeatures());
        Assert.assertTrue(bird.canSing());
    }

}
