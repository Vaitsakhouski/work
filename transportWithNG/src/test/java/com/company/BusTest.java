package com.company;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.awt.*;
import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 * Created by NotePad.by on 29.10.2016.
 */
public class BusTest {
    private Bus bus;
    ArrayList<Points> points;

    @DataProvider(name = "points")
    public Object[][] getPoints() {
        return new Object[][]{
                {150, new Points(0, 0), new Points(150, 0)},
        };
    }

    @org.testng.annotations.Test(dataProvider = "points")
    public void TestDistance(double expected, Points a, Points b) {
        points.add(a);
        points.add(b);
        assertEquals(new Bus().calculateDistance(points), expected);
    }

    @BeforeMethod
    public void setUp() throws Exception {
        bus = new Bus();
        points = new ArrayList<Points>();
    }

    @org.testng.annotations.Test
    public void testCalculateDistance1() throws Exception {
        points.add(new Points(0, 0));
        points.add(new Points(130, 0));
        org.testng.Assert.assertEquals(bus.calculateDistance(points), 130, 1);
    }

    @org.testng.annotations.Test
    public void testMoveToPoint1() throws Exception {
        points.add(new Points(0, 0));
        points.add(new Points(130, 0));
        org.testng.Assert.assertTrue(bus.moveToPoint(points));
    }

    @org.testng.annotations.Test
    public void testCost1() throws Exception {
        points.add(new Points(0, 0));
        points.add(new Points(130, 0));
        org.testng.Assert.assertEquals(0.8, bus.cost(points), 0.5);
    }

    @org.testng.annotations.Test
    public void testTime1() throws Exception {
        points.add(new Points(0, 0));
        points.add(new Points(130, 0));
        org.testng.Assert.assertEquals(bus.time(points), 130, 15);
    }
}