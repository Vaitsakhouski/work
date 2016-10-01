import java.util.Scanner;


public class Equation {
 /*Метод,позволяющий высчитывать корни квадратного уравнения */
	public static void main(String[] args) {	
		double a=0;
		double b=0;
		double c=0;
		System.out.println("ax^2+bx+c=0");
		System.out.println("Vvedite a - ");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextDouble()) {
		a=sc.nextDouble();
		}
		System.out.println("Vvedite b - ");
		Scanner sc1 = new Scanner(System.in);
		if(sc1.hasNextDouble()) {
		b=sc1.nextDouble();
		}
		System.out.println("Vvedite c - ");
		Scanner sc2 = new Scanner(System.in);
		if(sc2.hasNextDouble()) {
		c=sc2.nextDouble();
		}
		double diskr=Math.pow(b, 2)-4*a*c;
		double x1=(Math.sqrt(diskr)-b)/(2*a);
		double x2=(-Math.sqrt(diskr)-b)/(2*a);	
		System.out.println("discriminant= " + diskr);
		if(diskr>0) {
		System.out.println("korni:" + "\n" + "x1=" + x1 + "\n" + "x2=" + x2);
		} if(diskr==0) {
			System.out.println("koren:" + "\n" + x1);
		} else {
		    System.out.println("kornej net,t.k. discriminant < 0");
		}
	}
}
