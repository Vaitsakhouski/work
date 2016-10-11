package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Entrance point to the program.
 * Check the entered text to the specified rules
 *
 * @author Vaitsakhouski Raman
 * @since 08-10-2016
 */
public class Main {

    /**
     * Entrance point to the program
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {

        /**
         * Methods invocation
         * @param text - string, in which writting text
         */
        String text = null;
        System.out.println("Write text.");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            text = sc.nextLine();
        }
        Rule tr = new Rule(text);
        tr.rule();
    }
}