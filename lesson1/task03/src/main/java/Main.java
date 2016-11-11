/**
 * Arithmetic with numbers
 *
 * @author Vaitsakhouski Raman
 * @version 1.0
 * @since 01-10-2016
 */
public class Main {

    /**
     * Calculates 2 numbers and prints result to console
     * sum of 2 numbers
     * subtr of 2 number
     * multipl of 2 numbers
     * divis of 2 numbers
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 2 || args.length > 2) {
            System.out.println("You write not 2 numbers");
        } else {
            double number_1;
            number_1 = Double.parseDouble(args[0]);
            double number_2;
            number_2 = Double.parseDouble(args[1]);
            Calculate calculate = new Calculate(number_1, number_2);
            System.out.println(number_1 + "+" + number_2 + "=" + calculate.sum(number_1, number_2));
            System.out.println(number_1 + "-" + number_2 + "=" + calculate.subtr(number_1, number_2));
            System.out.println(number_1 + "*" + number_2 + "=" + calculate.multipl(number_1, number_2));
            System.out.println(number_1 + "/" + number_2 + "=" + calculate.divis(number_1, number_2));
        }
    }
}