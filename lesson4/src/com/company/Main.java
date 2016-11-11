package com.company;

/**
 * entry point in application
 */
public class Main {
    private static final String filePath = ".\\table.html";
    private static final String file_2Path = ".\\text.txt";

    /**
     * there is a method call, in witch
     * created html table
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        FileWorker tt = new FileWorker(filePath,file_2Path);
        tt.write();
    }
}
