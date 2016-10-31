package com.company;

import java.util.ArrayList;

/**
 * Calculating distance and checking
 * can transport go or not
 */
public abstract class Transport implements Moving {

    /**
     * calculate distance
     *
     * @return traversed path
     */
    @Override
    public abstract double calculateDistance(ArrayList<Points> points);

    /**
     * check,can transport or man go or no
     */
    @Override
    public abstract boolean moveToPoint(ArrayList<Points> points);
}