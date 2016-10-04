package com.company;

import java.util.Scanner;

/**
 * Calculation roots of equation
 *
 * @author Vaitsakhouski Raman
 * @since 01-10-2016
 */
public class Requation {
    public static void main(String[] args) {

        /**
         * write equation and find roots
         *
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
            if(sc.hasNextDouble()) {
                a=sc.nextDouble();
            } else {
                System.out.println("<a> must be number");
                System.exit(1);
            } if(Double.isInfinite(a)) {
                System.out.println("<a> going from massive");
                System.exit(1);
            }
            System.out.println("Write <b> - ");
            Scanner sc1 = new Scanner(System.in);
            if(sc1.hasNextDouble()) {
                b=sc1.nextDouble();
            } else {
                System.out.println("<b> must be number");
                System.exit(1);
            } if(Double.isInfinite(b)) {
                System.out.println("<b> going from massive");
                System.exit(1);
            }
            System.out.println("Write <c> - ");
            Scanner sc2 = new Scanner(System.in);
            if(sc2.hasNextDouble()) {
                c=sc2.nextDouble();
            } else {
                System.out.println("<c> must be number");
                System.exit(1);
            } if(Double.isInfinite(c)) {
                System.out.println("<c> going from massive");
                System.exit(1);
            }
            //calculate discriminant
            double discr=Math.pow(b, 2)-4*a*c;
            double x1=(Math.sqrt(discr)-b)/(2*a);
            double x2=(-Math.sqrt(discr)-b)/(2*a);
            System.out.println("discriminant= " + discr);
            if(discr>0) {
                System.out.println("roots:" + "\n" + "x1=" + x1 + "\n" + "x2=" + x2);
            }
            if(discr<0) {
                System.out.println("no roots because discriminant < 0");
            } else {
                System.out.println("root:" + "\n" + x1);
                }
        } catch(ArithmeticException e) {
            System.out.print("write correction number");
        }
    }
}