package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class, which has method with rule:
 * text must hasn't numbers
 */
public class Rule1 {
    private String text = null;

    /**
     * Inicial of  string param
     */
    public Rule1(String sq) {
        text=sq;
    }

    /**
     * Method, in which recorded rule
     */
    public void rule1() {
        Pattern p = Pattern.compile("\\D*$");
        Matcher m = p.matcher(text);
        boolean b = m.matches();
        if (m.matches()) {
            System.out.println("1.First paragraph: hasn't numbers. OK");
        } else {
            System.out.println("1.First paragraph: hasn't numbers. NO");
        }
    }
}