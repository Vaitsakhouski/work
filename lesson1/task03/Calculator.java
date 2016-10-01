import java.util.Scanner;


public class Calculator {
/* Метод, который высчитывает:сумму,разность,умножение и деление двух введенных*/
/* с клавиатуры чисел */
	public static void main(String[] args) {
		double a =0;
		double b = 0;	
		System.out.println("vvedite pervoe chislo - ");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextDouble()) {
		a=sc.nextDouble();
		} 
		System.out.println("vvedite vtoroe chislo - ");
		Scanner sc1=new Scanner(System.in);
		if(sc1.hasNextDouble()) {
		b=sc1.nextDouble();
		} 
		double sum=a+b;
		double razn=a-b;
		double umnoj=a*b;
		double del=a/b;
		System.out.println(a + "+" + b + "=" + sum + "\n" + a  + "-" + b + "=" + razn + "\n" + a + "*" + b + "=" + umnoj + "\n" + a + "/" + b + "=" + del);		
	}
}
