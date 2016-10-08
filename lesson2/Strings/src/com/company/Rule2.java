package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class, which has rule:
 * text must has only numbers
 */
public class Rule2 {
    private String text = null;

    /**
     * Inicial of  string param
     */
    public Rule2(String sq) {
        text=sq;
    }

    /**
     * Method, in which recorded rule
     */
    public void rule2() {
        Pattern p = Pattern.compile("^[0-9, ]+$");
        Matcher m = p.matcher(text);
        boolean b = m.matches();
        if (m.matches()) {
            System.out.println("2.Second paragraph: only numbers. OK");
        } else {
            System.out.println("2.Second paragraph: only numbers. NO");
        }
    }
}