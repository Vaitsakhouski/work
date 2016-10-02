import java.util.Scanner;

/**
 * Calculation of the roots of equation
 *
 * @author Vaitsakhouski Raman
 * @version 1.0
 * @since 01-10-2016
 */

public class Equation {
	public static void main(String[] args) {

    /**
     * write equation
     *
     * @param a - first coefficient of equation	 
	 * @param b - second coefficient of equation
	 * @param c - third coefficient of equation
	 * @param diskr - discriminant of equation
	 * @param x1 - first root of the equation
	 * @param x2 - second root of the equation
	 */
		double a=0;
		double b=0;
		double c=0;
		System.out.println("ax^2+bx+c=0");
		System.out.println("Write a - ");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextDouble()) {
		a=sc.nextDouble();
		}
		System.out.println("Write b - ");
		Scanner sc1 = new Scanner(System.in);
		if(sc1.hasNextDouble()) {
		b=sc1.nextDouble();
		}
		System.out.println("Write c - ");
		Scanner sc2 = new Scanner(System.in);
		if(sc2.hasNextDouble()) {
		c=sc2.nextDouble();
		}
		double diskr=Math.pow(b, 2)-4*a*c;
		double x1=(Math.sqrt(diskr)-b)/(2*a);
		double x2=(-Math.sqrt(diskr)-b)/(2*a);	
		System.out.println("discriminant= " + diskr);
		if(diskr>0) {
		System.out.println("roots:" + "\n" + "x1=" + x1 + "\n" + "x2=" + x2);
		} if(diskr==0) {
			System.out.println("root:" + "\n" + x1);
		} else {
		    System.out.println("no roots because discriminant < 0");
		}
	}
}
