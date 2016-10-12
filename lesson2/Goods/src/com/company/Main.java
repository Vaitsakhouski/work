package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Entrance point to the program.
 *
 * @author Vaitsakhouski Raman
 * @since 11-10-2016
 */
public class Main {

    /**
     * Creating object
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        Goods goods= new Goods();
        goods.setList();
        goods.show();
        Commands command = new Commands();
        command.Commands();
    }
}