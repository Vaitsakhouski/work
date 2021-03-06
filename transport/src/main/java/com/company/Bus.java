package com.company;

import java.util.ArrayList;

/**
 * Calculating distance, time in which
 * car will drive from point a
 * to point b and cost of
 * passage
 */
public class Bus extends Transport {
    private double speed;
    private int passengers;
    private double priceOfFuel;
    private double consumptionOn100;

    /**
     * creating object of bus
     */
    public Bus() {
        this.consumptionOn100 = 50;
        this.speed = 60;
        this.passengers = 40;
        this.priceOfFuel = 0.5;
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
     * calculating distance
     *
     * @return traversed path
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
     * calculating cost of passage
     *
     * @return double cost, cost of passage
     */
    @Override
    public double cost() {
        double distance;
        distance = calculateDistance();
        double cost = distance * consumptionOn100 * priceOfFuel / (100 * passengers);
        return cost;
    }

    /**
     * calculating time of passage
     *
     * @return - double time, time of passage
     */
    @Override
    public double time() {
        double distance;
        distance = calculateDistance();
        double time = (distance / speed) * 60;
        return time;
    }
}
