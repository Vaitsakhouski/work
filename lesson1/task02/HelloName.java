import java.util.Scanner;
/**
 * Prints "Hello, name", where name 
 * entered from the keyboard. If it's null,
 * will be print "Hello, "
 *
 * @author Vaitsakhouski Raman
 * @version 1.0
 * @since 01-10-2016
 */
public class HelloName {
	public static void main(String[] args) {
		String b = null;
		System.out.println("write your name -  ");
		Scanner sc = new Scanner(System.in);
		b=sc.nextLine();
		System.out.println("Hello, " + b);
		}
	}

