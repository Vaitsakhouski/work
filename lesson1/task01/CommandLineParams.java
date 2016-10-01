public class CommandLineParams {
    /*Метод, который предназначен для вывода параметров в обратном порядке */
	public static void main(String[] args) {
		for(int i =args.length -1; i>=0; i--) {
			System.out.println("argument " + i + " = " + args[i]);
		}
	}
}
