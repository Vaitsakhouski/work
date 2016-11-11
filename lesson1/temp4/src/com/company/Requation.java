package com.company;

/**
 * checking on valid coef of requation
 * and calculating discriminant
 */
public class Requation {
    private double a;
    private double b;
    private double c;

    /**
     * inicial of coef
     *
     * @param coef_a - coef a
     * @param coef_b - coef b
     * @param coef_c - coef c
     */
    public Requation(double coef_a, double coef_b, double coef_c) {
        this.a = coef_a;
        this.b = coef_b;
        this.c = coef_c;
    }

    /**
     * checling coef on valid
     */
    public void valid() throws Exception {
        if (new Double(Double.MIN_VALUE / a).isInfinite() || new Double(Double.MIN_VALUE / b).isInfinite() || new Double(Double.MIN_VALUE / c).isInfinite()) {
            throw new Exception("coef can't be 0");
        } else if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c)) {
            throw new Exception("coef must be number");
        } else if (a > Double.MAX_VALUE || b > Double.MAX_VALUE || c > Double.MAX_VALUE) {
            throw new Exception("so big value");
        } else if (a < Double.MIN_VALUE || b < Double.MIN_VALUE || c < Double.MIN_VALUE) {
            throw new Exception("so low value");
        }
    }

    /**
     * calculating discriminant
     *
     * @return double discr
     */
    public double getDiscr() throws Exception {
        double discr = Math.pow(b, 2) - 4 * a * c;
        double x1 = (Math.sqrt(discr) - b) / (2 * a);
        double x2 = (-Math.sqrt(discr) - b) / (2 * a);
        System.out.println("discriminant= " + discr);
        if (discr > 0) {
            System.out.println("roots:" + "\n" + "x1=" + x1 + "\n" + "x2=" + x2);
        }
        if (discr < 0) {
            System.out.println("no roots because discriminant < 0");
        }
        if (new Double(1.0 / discr).isInfinite()) {
            System.out.println("root:" + "\n" + x1);
        }
        return discr;
    }
}
