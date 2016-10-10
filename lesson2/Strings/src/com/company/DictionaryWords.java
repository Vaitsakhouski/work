package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class, which has method with rule:
 * text must has though one word from dictionary
 */
public class DictionaryWords {
    private String text = null;

    /**
     * Inicial of  string param
     */
    public DictionaryWords(String sq) {
        text = sq;
    }

    /**
     * Method, in which recorded rule
     */
    public void rule4() {
        if (text.contains("call")) {
            System.out.println("4.Fourth paragraph: it contains word from the dictionary. OK");
        } else {
            System.out.println("4.Fourth paragraph: it contains word from the dictionary. NO");
        }
    }
}