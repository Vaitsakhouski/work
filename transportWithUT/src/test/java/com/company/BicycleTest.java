package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NotePad.by on 29.10.2016.
 */
public class BicycleTest {
    private Bicycle bicycle;

    @Before
    public void setUP() throws Exception {
        bicycle = new Bicycle();
    }

    @Test
    public void moveToPoint() throws Exception {
        Assert.assertTrue(bicycle.moveToPoint());
    }

    @Test
    public void calculateDistance() throws Exception {
        Assert.assertEquals(130, bicycle.calculateDistance(), 1);
    }

    @Test
    public void cost() throws Exception {
        Assert.assertEquals(0, bicycle.cost(), 0.01);
    }

    @Test
    public void time() throws Exception {
        Assert.assertEquals(780, bicycle.time(), 15);
    }
}