package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        System.out.println("write first number -");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            a=sc.nextDouble();
        }
        System.out.println("write second number -");
        Scanner qw = new Scanner(System.in);
        if (qw.hasNextDouble()) {
            b=qw.nextDouble();
        }
        Calculator g = new Calculator(a,b);
    }
}
