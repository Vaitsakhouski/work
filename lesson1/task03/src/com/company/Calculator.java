package com.company;


/**
 * Created by NotePad.by on 02.10.2016.
 */
public class Calculator {

    public double a;
    public double b;
    public Calculator(double number_1, double number_2) {
        a=number_1;
        b=number_2;
        System.out.println(number_1 + "+" + number_2 + "=" + sum(number_1,number_2));
        System.out.println(number_1 + "-" + number_2 + "=" + subtr(number_1,number_2));
        System.out.println(number_1 + "*" + number_2 + "=" + multipl(number_1,number_2));
        if(number_2==0) {
            System.out.println("divis on 0");
        } else {
            System.out.println(number_1 + "/" + number_2 + "=" + divis(number_1,number_2));
        }

    }

        public static double sum(double number_1,double number_2) {
            return number_1 + number_2;
        }
        public static double subtr(double number_1,double number_2) {
            return number_1 - number_2;
        }
        public static double multipl(double number_1,double number_2) {
            return number_1 * number_2;
        }
        public static double divis(double number_1,double number_2) {
            return number_1 / number_2;
    }
}
