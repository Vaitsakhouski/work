import java.util.Scanner;

/**
 * creating triangle,checking sides
 * conclusion type of triangle
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    public static final String EQUILATERAL = "Triangle is equilateral";
    public static final String ISOSCELES = "Triangle is isosceles";
    public static final String SIMPLE = "Triangle is simple";

    /**
     * inicial of  sides
     *
     * @param side_1 - a side of triangle
     * @param side_2 - b side of triangle
     * @param side_3 - c side of triangle
     */
    public Triangle(double side_1, double side_2, double side_3) {
        this.a = side_1;
        this.b = side_2;
        this.c = side_3;
    }

    public Triangle() {

    }

    /**
     * validation sides of triangle
     * side can't be Infinite
     * sum of 2 sides must be more then 3 side
     */
    public void valid() throws Exception {
        if (Double.isInfinite(a) || Double.isInfinite(b) || Double.isInfinite(c)) {
            throw new Exception("side cant me infinity");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new Exception("sum of 2 sides must be > then third side");
        }
        if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c)) {
            throw new Exception("side must be number");
        }
    }

    /**
     * conclusion type of triangle
     *
     * @return String - type of triangle
     */
    public String getType() throws Exception {
        valid();
        if (a == b && b == c) {
            return EQUILATERAL;
        }
        if (a == b || a == c || b == c) {
            return ISOSCELES;
        } else {
            return SIMPLE;
        }
    }
}