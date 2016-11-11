package com.company;

import java.util.Scanner;

/**
 * Calculation roots of equation
 *
 * @author Vaitsakhouski Raman
 * @since 01-10-2016
 */
public class Main {

    /**
     * Method, in which write equation and find roots
     */
    public static void main(String[] args) {

        /**
         * @param a - first coef
         * @param b - second coef
         * @param c - third coef
         */
        try {
            double a = 0;
            double b = 0;
            double c = 0;
            System.out.println("ax^2+bx+c=0");
            System.out.println("Write <a> - ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
            } else {
                System.out.println("<a> must be number");
                System.exit(1);
            }
            System.out.println("Write <b> - ");
            Scanner sc1 = new Scanner(System.in);
            if (sc1.hasNextDouble()) {
                b = sc1.nextDouble();
            } else {
                System.out.println("<b> must be number");
                System.exit(1);
            }
            System.out.println("Write <c> - ");
            Scanner sc2 = new Scanner(System.in);
            if (sc2.hasNextDouble()) {
                c = sc2.nextDouble();
            } else {
                System.out.println("<c> must be number");
                System.exit(1);
            }
            Requation requation = new Requation(a, b, c);
            requation.valid();
            requation.getDiscr();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}