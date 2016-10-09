package com.company;

/**
 * Class, which has method:
 * if you write empty string -
 * close the program
 */
public class Empty {
    private String text = null;

    /**
     * Inicial of  string param
     */
    public Empty(String sq) {
        text=sq;
    }

    /**
     * Method, which close the program
     * if you don't write a text
     */
    public void empty() {
        System.out.println("You dont write text");
        System.exit(1);
    }
}