package com.company;

import java.util.ArrayList;

/**
 * Calculating distance, time in which
 * bicycle will drive from point a
 * to point b
 */
public class Bicycle implements Moving {
    private double speed;

    /**
     * creating object of bicycle
     */
    public Bicycle() {
        this.speed = 10;
    }

    /**
     * calculating distance
     *
     * @return double distance
     */
    @Override
    public double calculateDistance() {
        double distance = 0;
        double coordinateX;
        double coordinateY;
        ArrayList<Points> points = Points.Route();
        for (int i = 1; i < points.size(); i++) {
            coordinateX = (points.get(i).x - points.get(i - 1).x);
            coordinateY = (points.get(i).y - points.get(i - 1).y);
            distance += Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
        }
        return distance;
    }

    /**
     * checking, can car move or not
     *
     * @return boolean, if can-true
     *                  if can't-false
     */
    @Override
    public boolean moveToPoint() {
        ArrayList<Points> points = Points.Route();
        if (!(points.get(0) == points.get(points.size() - 1))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * calculating cost of passage
     *
     * @return double cost, return=0, becouse
     * bicycle don't use fuel
     */
    @Override
    public double cost() {
        return 0;
    }

    /**
     * calculating time of passage
     *
     * @return double time, time of passage
     */
    @Override
    public double time() {
        double distance;
        distance = calculateDistance();
        double time = (distance / speed) * 60;
        return time;
    }
}
