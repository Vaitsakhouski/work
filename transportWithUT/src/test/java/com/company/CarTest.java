package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by NotePad.by on 28.10.2016.
 */
public class CarTest {
    private Car car;

    @Before
    public void setUP() throws Exception {
        car = new Car();
    }

    @Test
    public void moveToPoint() throws Exception {
        Assert.assertTrue(car.moveToPoint());
    }

    @Test
    public void cost() throws Exception {
        Assert.assertEquals(7, car.cost(), 0.5);
    }

    @Test
    public void time() throws Exception {
        Assert.assertEquals(86, car.time(), 15);
    }

    @Test
    public void calculateDistance() throws Exception {
        Assert.assertEquals(130, car.calculateDistance(), 1);
    }
}