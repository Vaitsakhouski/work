package com.company;

import java.io.File;
import java.io.IOException;

/**
 * entry point in application
 */
public class Main {
    private static final String filePath = ".\\table.html";
    private static final String dirPath = ".";

    /**
     * there is a method call, in witch
     * created html table
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        FileWorker text = new FileWorker(filePath, dirPath);
        text.push();
    }
}