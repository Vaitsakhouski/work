/**
 * checking numbers
 * operations with numbers(sum,subtr,multipl,
 * divis)
 */
public class Calculate {
    private double number1;
    private double number2;

    public Calculate(double number_1,double number_2) {
        this.number1=number_1;
        this.number2=number_2;
    }

    public void valid() throws Exception {
        if(new Double(Double.MIN_VALUE/number2).isInfinite()) {
            throw new Exception("divis on zero");
        }
    }
    /**
     * Performing adding number_1 to number_2
     *
     * @param number1 first summand
     * @param number2 second summand
     * @return double sum of number_1 and nubmer_2
     */
    public double sum(double number1, double number2) {
        return number1 + number2;
    }

    /**
     * Performing subtracting number_2 from number_1
     *
     * @param number1 is a subtrahend
     * @param number2 is a minuend
     * @return double difference of number_1 and number_2
     */
    public double subtr(double number1, double number2) {
        return number1 - number2;
    }

    /**
     * Performing multiplying number_1 and number_2
     *
     * @param number1 is a multiplicand
     * @param number2 is a multiplier
     * @return double multiplication of number_1 and number_2
     */
    public double multipl(double number1, double number2) {
        return number1 * number2;
    }

    /**
     * Perfoming dividing number_1 to number_2
     *
     * @param number1 is a divider
     * @param number2 is a dividend
     * @return double result of the division
     */
    public double divis(double number1, double number2) throws Exception {
        valid();
        return number1 / number2;
    }
}
