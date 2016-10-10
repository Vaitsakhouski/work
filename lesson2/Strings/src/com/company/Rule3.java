package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class, which has method with rule:
 * text must have more 5 words
 */
public class Rule3 {
    private String text = null;

    /**
     * Inicial of  string param
     */
    public Rule3(String sq) {
        text = sq;
    }

    /**
     * Method, in which recorded rule
     */
    public void rule3() {
         Pattern p = Pattern.compile("^(([\\D*]([a-zA-Z0-9, !@#$%^&*])+){2,}([,][ ][a-zA-Z0-9, !@#$%^&*]+)){2,}$");
         Matcher m = p.matcher(text);
         boolean b = m.matches();
        if (m.matches()) {
            System.out.println("3.Third paragraph: more 5 words. OK");
        } else {
            System.out.println("3.Third paragraph: more 5 words. NO");
        }
    }
}
