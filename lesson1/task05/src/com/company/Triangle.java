package com.company;


public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle(double side_1, double side_2, double side_3) {
        a = side_1;
        b = side_2;
        c = side_3;
    }
    public void equilateral() {
        if(a==b&&b==c&&a==c) {
            System.out.print("Triangle is equilateral");
        }  else {
            if (a == b || a == c || b == c) {
                System.out.print("Triangle is isos");
            } else {

            }
        }
    }
    public void simple() {
        if(a!=b&&b!=c&&c!=a)
            System.out.print("Triangle is simple");
    }
    public void nuthing() {
        if(a >= b + c || b >= a + c || c >= a + b) {
            System.out.print("this triangle does not exist");
            if(a==0||b==0||c==0) {
                System.out.print("this triangle does not exist");
                if(a<0||b<0||c<0) {
                    System.out.print("this triangle does not exist");
                }
            }
        }
    }
    }