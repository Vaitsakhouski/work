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
                {2.2, 3.0, 2.2},
                {3.0, 2.2, 2.2},
                {2.2, 2.2, 3.0},
                {Double.MAX_VALUE, 12, Double.MAX_VALUE},
                {12, Double.MAX_VALUE, Double.MAX_VALUE},
                {Double.MAX_VALUE, Double.MAX_VALUE, 12},
                {Double.MIN_VALUE,0.0001,0.0001},
                {0.0001,0.0001,Double.MIN_VALUE,},
                {0.0001,Double.MIN_VALUE,0.0001},
                {Double.MIN_VALUE,Double.MAX_VALUE,Double.MAX_VALUE},
                {Double.MAX_VALUE,Double.MIN_VALUE,Double.MAX_VALUE},
                {Double.MAX_VALUE,Double.MAX_VALUE,Double.MIN_VALUE},
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
        };
    }

    @Test(dataProvider = "getPositiveNumberOfSimple")
    public void testGetSimpleType(double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        tr.valid();
        Assert.assertEquals(tr.getType(), Triangle.SIMPLE);
    }

    @DataProvider(name = "getNegative")
    public Object[][] getNegativeNumber() {
        return new Object[][]{
                {"Triangle is equilateral",0, 0, 0},
                {"Triangle is simple",-1,2,3},
                {"Triangle is simple",2,-1,3},
                {"Triangle is simple",3,2,-1},
                {"Triangle is simple",Double.NaN, 2, 3},
                {"Triangle is simple",2,3,Double.NaN},
                {"Triangle is simple",2,Double.NaN,3},
                {"Triangle is simple",100,1,150},
                {"Triangle is isosceles",1, 0, 0},
                {"Triangle is isosceles",0,1,0},
                {"Triangle is isosceles",0,0,1},
                {"Triangle is isosceles",Double.POSITIVE_INFINITY, 1, 1},
                {"Triangle is isosceles",1,Double.POSITIVE_INFINITY,1},
                {"Triangle is isosceles",1,1,Double.POSITIVE_INFINITY},
                {"Triangle is isosceles",Double.NEGATIVE_INFINITY, 1, 1},
                {"Triangle is isosceles",1,1,Double.NEGATIVE_INFINITY},
                {"Triangle is isosceles",1,Double.NEGATIVE_INFINITY,1},
                {"Triangle is isosceles",Double.MIN_VALUE,Double.MIN_VALUE,Double.MAX_VALUE},
                {"Triangle is isosceles",Double.MAX_VALUE,Double.MIN_VALUE,Double.MIN_VALUE},
                {"Triangle is isosceles",Double.MIN_VALUE,Double.MAX_VALUE,Double.MIN_VALUE},
        };
    }

    @Test(dataProvider = "getNegative")
    public void testGetNotExistType(String expected,double a, double b, double c) throws Exception {
        tr = new Triangle(a, b, c);
        Assert.assertEquals(tr.getType(),expected);
    }
}