package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     double a = 0;
         double b = 0;
         double c = 0;
         int r=1;
         switch(r) {
            case 1:
                System.out.println("write length of the side <a> - ");
                Scanner sc = new Scanner(System.in);
                if(sc.hasNextDouble()) {
                    a = sc.nextDouble();
                } else {
                    System.out.print("write correct numb");
                    break;
                }
            case 2:
                System.out.println("write length of the side <b> - ");
                Scanner qw = new Scanner(System.in);
                if(qw.hasNextDouble()) {
                    b = qw.nextDouble();
                } else {
                    System.out.print("write correct numb");
                    break;
                }
            case 3:
                System.out.println("write length of the side <c> - ");
                Scanner we = new Scanner(System.in);
                if(we.hasNextDouble()) {
                    c = we.nextDouble();
                } else {
                    System.out.print("write correct numb");
                    break;
                }
        }
        Triangle v = new Triangle(a,b,c);
       /* v.nuthing();
        v.equilateral();
        v.simple();*/
        
        M1: {
            if (a >= b + c || b >= a + c || c >= a + b)
                break M1;
            M2: {
                if(a==0||b==0||c==0)
                break M2;
                M3: {
                    if(a<0||b<0||c<0)
                        break M3;
                    M4: {
                        v.equilateral();
                        v.simple();
                    }
                }
            }
        }

    }
}
