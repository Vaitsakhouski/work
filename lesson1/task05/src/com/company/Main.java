package com.company;

import java.util.Scanner;
/**
 * Check triangle on its type
 * @author Vaitsakhouski Raman
 * @since 01-10-2016
 */
public class Main {
    /**
     * Method, in which write sides of triange, and know, what tipe is it useless comment and blank lines
     */
    public static void main(String[] args) {
        /**
         * @param a - first side
         * @param b - second side
         * @param c - third side
         */
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.println("write length of the side <a> - ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()) {
            a = sc.nextDouble();
        } else {
            System.out.println("<a> must be number");
            System.exit(1);
        }
        if(Double.isInfinite(a)) {
            System.out.println("<a> going from limits");
            System.exit(1);
        }
        System.out.println("write length of the side <b> - ");
        Scanner qw = new Scanner(System.in);
        if(qw.hasNextDouble()) {
            b = qw.nextDouble();
        } else {
            System.out.println("<b> must be number");
            System.exit(1);
        }
        if(Double.isInfinite(b)) {
            System.out.println("<b> going from limits");
            System.exit(1);
        }
        System.out.println("write length of the side <c> - ");
        Scanner we = new Scanner(System.in);
        if(we.hasNextDouble()) {
            c = we.nextDouble();
        } else {
            System.out.println("<c> must be number");
            System.exit(1);
        }
        if(Double.isInfinite(c)) {
            System.out.println("<c> going from limits");
            System.exit(1);
        }
        Triangle v = new Triangle(a,b,c);
        /**
         * request method, which check triangle the existence
         */
        v.nuthing();
        /**
         * request method, which check triangle equilateral or isosceles
         */
        v.equilateral();
        /**
         * request method, which check triangle simple
         */
        v.simple();
    }
}