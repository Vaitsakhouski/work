package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * Checkpoint, which has coordinates x and y
 */
public class Points {
    public static String path = ".\\checkPoints.txt";
    public double x;
    public double y;

    /**
     * Building point with coordinates
     *
     * @param x - coordinate x of the point
     * @param y - coordinate y of the point
     */
    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * reading of file with route
     * creating list of checkpoints
     *
     * @return ArrayList<Points>, list of points of route
     */
    public static ArrayList<Points> Route() {
        try {
            ArrayList<String> list = new ArrayList<String>();
            ArrayList<Points> points = new ArrayList<Points>();
            FileReader fr = new FileReader(path);
            BufferedReader bq = new BufferedReader(fr);
            String line;
            try {
                while ((line = bq.readLine()) != null) {
                    list.add(line);
                }
                for (String string : list) {
                    String[] coord = string.split(" ");
                    double x = Double.parseDouble(coord[0]);
                    double y = Double.parseDouble(coord[1]);
                    points.add(new Points(x, y));
                }
                return points;
            } catch (IOException e) {
                System.out.println("error reading file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not founded");
            System.exit(1);
        }
        return null;
    }
}
