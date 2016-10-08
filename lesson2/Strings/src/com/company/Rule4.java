package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class, which has rule:
 * text must has though one word from dictionary
 */
public class Rule4 {
    private String text = null;

    /**
     * Inicial of  string param
     */
    public Rule4(String sq) {
        text=sq;
    }

    /**
     * Method, in which recorded rule
     */
    public void rule4() {
        Pattern p = Pattern.compile("^(([a-zA-Z0-9, ]+)([,][ ][a-zA-Z0-9]+))[call,me,back]$");
        Matcher m = p.matcher(text);
        boolean b = m.matches();
        if (m.matches()) {
            System.out.println("4.Fourth paragraph: it contains word from the dictionary. OK");
        } else {
            System.out.println("4.Fourth paragraph: it contains word from the dictionary. NO");
        }
    }
}