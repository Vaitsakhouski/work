import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Math.pow;
import static org.testng.Assert.*;

/**
 * Created by NotePad.by on 05.11.2016.
 */
public class TriangleTest {
    private Triangle tr;

    @BeforeMethod
    public void setUp() throws Exception {
        tr = new Triangle();
    }

    @DataProvider(name = "positiveNumberOfEquilateral")
    public Object[][] getNumber() {
        return new Object[][]{
                {2, 2, 2},
                {3.3, 3.3, 3.3},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE},
                {Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE},
        };
    }

    @Test(dataProvider = "positiveNumberOfEquilateral")
    public void testGetEquilateralType(double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        Assert.assertEquals(tr.getType(), Triangle.EQUILATERAL);
    }


    @DataProvider(name = "getPositiveNumberOfIsosceles")
    public Object[][] getPositiveNumberOfIsoscelesTriangle() {
        return new Object[][]{
                {2, 3, 2},
                {2.2, 3.0, 2.2},
                {Double.MAX_VALUE, 12, Double.MAX_VALUE},
        };
    }

    @Test(dataProvider = "getPositiveNumberOfIsosceles")
    public void testGetIsoscelesType(double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        Assert.assertEquals(tr.getType(), Triangle.ISOSCELES);
    }

    @DataProvider(name = "getPositiveNumberOfSimple")
    public Object[][] getPositiveNumberOfSimpleTriangle() {
        return new Object[][]{
                {4, 7, 5},
                {4.0, 7, 5.0},
        };
    }

    @Test(dataProvider = "getPositiveNumberOfSimple")
    public void testGetSimpleType(double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        Assert.assertEquals(tr.getType(), Triangle.SIMPLE);
    }

    @DataProvider(name = "getNegative")
    public Object[][] getNegativeNumber() {
        return new Object[][]{
                {"-1", "-2", "-3"},
                {"gr", "gre", "q"},
                {null, null, null},
                {Double.NaN, 2, 3},
                {Double.POSITIVE_INFINITY, 0, 1},
                {Double.NEGATIVE_INFINITY, 1, 1},
        };
    }

    @Test(dataProvider = "getNegative")
    public void testGetNotExistType(double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        Assert.assertEquals(tr.getType(), Triangle.class);
    }
}