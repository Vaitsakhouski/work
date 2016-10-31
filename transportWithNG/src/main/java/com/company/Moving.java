package com.company;

import java.util.ArrayList;

/**
 * Calculating distance and checking
 * can transport go or not
 */
public interface Moving {

    /**
     * calculate distance
     *
     * @return traversed path
     */
    public abstract double calculateDistance(ArrayList<Points> points);

    /**
     * check,can transport or man go or no
     */
    public boolean moveToPoint(ArrayList<Points> points);

    /**
     * calculating cost of passage
     *
     * @return double cost, cost of passage
     */
    public abstract double cost(ArrayList<Points> points);

    /**
     * caclculating time of passage
     *
     * @return double time, time of passage
     */
    public abstract double time(ArrayList<Points> points);
}