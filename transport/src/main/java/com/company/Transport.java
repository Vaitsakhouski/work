package com.company;

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
    public abstract double calculateDistance();

    /**
     * check,can transport or man go or no
     */
    @Override
    public abstract boolean moveToPoint();
}
