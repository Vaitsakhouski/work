package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NotePad.by on 29.10.2016.
 */
public class BusTest {
    private Bus bus;

    @Before
    public void setUP() throws Exception {
        bus = new Bus();
    }

    @Test
    public void moveToPoint() throws Exception {
        Assert.assertTrue(bus.moveToPoint());
    }

    @Test
    public void calculateDistance() throws Exception {
        Assert.assertEquals(130, bus.calculateDistance(), 1);
    }

    @Test
    public void cost() throws Exception {
        Assert.assertEquals(0.8, bus.cost(), 0.5);
    }

    @Test
    public void time() throws Exception {
        Assert.assertEquals(115, bus.time(), 15);
    }
}