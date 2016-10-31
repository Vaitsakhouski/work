package com.company;

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
    public abstract double calculateDistance();

    /**
     * check,can transport or man go or no
     */
    public boolean moveToPoint();

    /**
     * calculating cost of passage
     *
     * @return double cost, cost of passage
     */
    public abstract double cost();

    /**
     * caclculating time of passage
     *
     * @return double time, time of passage
     */
    public abstract double time();
}
