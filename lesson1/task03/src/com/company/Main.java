package com.company;

/**
 * Arithmetic with numbers
 * @author Vaitsakhouski Raman
 * @version 1.0
 * @since 01-10-2016
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Calculates 2 numbers and prints result to console
         *
         * @param number_1 - first number
         * @param number_2 - second number
         */
        if(args.length<2||args.length>2) {
            System.out.println("You write not 2 numbers");
        } else {
            double sum=0;
            double subtr = 0;
            double multipl = 0;
            double divis = 0;
            double number_1;
            number_1=Double.parseDouble(args[0]);
            double number_2;
            number_2=Double.parseDouble(args[1]);
            sum=sum(number_1,number_2);
            subtr=subtr(number_1,number_2);
            multipl=multipl(number_1,number_2);
            divis=divis(number_1,number_2);
            System.out.println(number_1 + "+" + number_2 + "=" + sum(number_1,number_2));
            System.out.println(number_1 + "-" + number_2 + "=" + subtr(number_1,number_2));
            System.out.println(number_1 + "*" + number_2 + "=" + multipl(number_1,number_2));
            if(number_2==0) {
                System.out.println("divis on 0");
            } else {
                System.out.println(number_1 + "/" + number_2 + "=" + divis(number_1,number_2));
            }
        }
    }

    /**
     * Performing adding number_1 to number_2
     *
     * @param number_1 first summand
     * @param number_2 second summand
     * @return sum of number_1 and nubmer_2
     */
    public static double sum(double number_1,double number_2) {
        return number_1 + number_2;
    }

    /**
     * Performing subtracting number_2 from number_1
     *
     * @param number_1 is a subtrahend
     * @param number_2 is a minuend
     * @return difference of number_1 and number_2
     */
    public static double subtr(double number_1,double number_2) {
        return number_1 - number_2;
    }

    /**
     * Performing multiplying number_1 and number_2
     *
     * @param number_1 is a multiplicand
     * @param number_2 is a multiplier
     * @return multiplication of number_1 and number_2
     */
    public static double multipl(double number_1,double number_2) {
        return number_1 * number_2;
    }

    /**
     * Perfoming dividing number_1 to number_2
     *
     * @param number_1 is a divider
     * @param number_2 is a dividend
     * @return result of the division
     */
    public static double divis(double number_1,double number_2) {
        return number_1 / number_2;
    }
}
