import java.util.Scanner;
/**
 * Prints "Hello, " to console
 *
 * @author Vaitsakhouski Raman
 * @version 1.0
 * @since 01-10-2016
 */
public class HelloName {

    /**
     * Prints "Hello, "name" ", where name taken from
     * first argument in <code>args</code>.
     *
     * @param args - command line argument
     */
	public static void main(String[] args) {
		for(int i = 0 ; i < args.length; i++) {
			System.out.println("Hello, " + args[i]);
		}
	}
}