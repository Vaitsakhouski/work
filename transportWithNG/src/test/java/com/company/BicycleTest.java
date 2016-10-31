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
public class BicycleTest {
    private Bicycle bicycle;
    ArrayList<Points> points;

    @BeforeMethod
    public void setUp() throws Exception {
        bicycle = new Bicycle();
        points = new ArrayList<Points>();
    }

    @DataProvider(name = "points")
    public Object[][] getPoints() {
        return new Object[][]{
                {150, new Points(0, 0), new Points(150, 0)},
                {160, new Points(0, 0), new Points(160, 0)},
        };
    }

    @org.testng.annotations.Test(dataProvider = "points")
    public void TestDistance(double expected, Points a, Points b) {
        points.add(a);
        points.add(b);
        assertEquals(new Bicycle().calculateDistance(points), expected);
    }

    @org.testng.annotations.Test
    public void testCalculateDistance() throws Exception {
        points.add(new Points(0, 0));
        points.add(new Points(130, 0));
        Assert.assertEquals(bicycle.calculateDistance(points),130 , 1);
    }

    @org.testng.annotations.Test
    public void testMoveToPoint() throws Exception {
        points.add(new Points(0, 0));
        points.add(new Points(130, 0));
        Assert.assertTrue(bicycle.moveToPoint(points));
    }

    @org.testng.annotations.Test
    public void testTime() throws Exception {
        points.add(new Points(0, 0));
        points.add(new Points(130, 0));
        Assert.assertEquals(bicycle.time(points),780 , 0.1);
    }
}