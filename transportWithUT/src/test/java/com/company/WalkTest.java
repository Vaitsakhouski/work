package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NotePad.by on 29.10.2016.
 */
public class WalkTest {
    private Walk walk;

    @Before
    public void setUP() throws Exception {
        walk = new Walk();
    }

    @Test
    public void moveToPoint() throws Exception {
        Assert.assertTrue(walk.moveToPoint());
    }

    @Test
    public void calculateDistance() throws Exception {
        Assert.assertEquals(130, walk.calculateDistance(), 1);
    }

    @Test
    public void cost() throws Exception {
        Assert.assertEquals(0, walk.cost(), 0.01);
    }

    @Test
    public void time() throws Exception {
        Assert.assertEquals(1560, walk.time(), 15);
    }
}