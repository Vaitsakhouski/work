/**
 * Prints "Hello, name", where name taken
 * from first argument in args. If it's null,
 * will be print nothing
 *
 * @param args command line argument
 */
public class HelloName {
	public static void main(String[] args) {
		String name = "name";
		if(args.length!=0) {
			name = args[0];
		}
			System.out.println("Hello, " + args[i]);
	}
}
