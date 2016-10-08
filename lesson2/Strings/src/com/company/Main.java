package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Entrance point to the program.
 * @author Vaitsakhouski Raman
 * @since 08-10-2016
 */
public class Main {

    /**
     * Entrance point to the program
     */
    public static void main(String[] args) {

        /**
         * methods invocation
         * @param text - string, in which writting text
         */
        String text=null;
        System.out.println("Write text. Words or numbers must be separated (, )");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            text=sc.nextLine();
        }
        Rule1 vs = new Rule1(text);
        Rule2 sw = new Rule2(text);
        Rule3 wq = new Rule3(text);
        Rule4 we = new Rule4(text);
        vs.rule1();
        sw.rule2();
        wq.rule3();
        we.rule4();
    }
}