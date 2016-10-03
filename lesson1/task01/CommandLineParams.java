/**
 * Class, that prints arguments in reversed order
 *
 * @author Vaitsakhouski Raman
 * @version 1.0
 * @since 01-10-2016
 */
public class CommandLineParams {

	/**
	 *
	 * @param args argument array to revert
	 */
	public static void main(String[] args) {
		for(int i =args.length -1; i>=0; i--) {
			System.out.println("argument " + i + " = " + args[i]);
		}
	}
}