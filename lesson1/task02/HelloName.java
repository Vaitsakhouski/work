public class HelloName {
    /*Метод, который выводит введенное имя с консоли, после слова "Hello," */
	public static void main(String[] args) {
		for(int i = 0 ; i < args.length; i++) {
			System.out.println("Hello, " + args[i]);
		}
	}
}
