package com.company;

/**
 * Class, comprising methods of check triangles
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    //making links of  sides
    public Triangle(double side_1, double side_2, double side_3) {
        a = side_1;
        b = side_2;
        c = side_3;
    }

    //method, which check triangle equilateral or isosceles
    public void equilateral() {
        if (a == b && b == c && a == c) {
            System.out.print("Triangle is equilateral");
        } else {
            if (a == b || a == c || b == c) {
                System.out.print("Triangle is isos");
            }
        }
    }

    //method, which check triangle simple
    public void simple() {
        if(a!=b&&b!=c&&c!=a)
            System.out.print("Triangle is simple");
    }

    //method, which check triangle the existence
    public void nuthing() {
        if(a >= b + c || b >= a + c || c >= a + b) {
            System.out.print("this triangle does not exist");
            System.exit(1);
            if(a<0||b<0||c<0) {
                System.out.print("this triangle does not exist");
                System.exit(1);
            }
        }
    }
}