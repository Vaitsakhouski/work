package com.company;

import java.util.ArrayList;

/**
 * The output statistics (cost and time)
 * of one of the modes of transportation:
 * car,bus,walk,bicycle
 *
 * @author Vaitsakhouski Raman
 */
public class Main {

    /**
     * memory allocation for objects
     * and print cost and time of trip
     * on car,bus,walk,bicycle
     *
     * @param args - command line argument
     */
    public static void main(String[] args) {
        //ArrayList<Points> points;
        Car car = new Car();
        Bus bus = new Bus();
        Walk man = new Walk();
        Bicycle bicycle = new Bicycle();
        if (car.moveToPoint(Points.Route())) {
            double costo = car.cost(Points.Route());
            double time = car.time(Points.Route());
            System.out.print("Car : " + "cost - " + costo + "$" + " ,time - " + time + " minutes\n");
        }
        if (bus.moveToPoint(Points.Route())) {
            double costo = bus.cost(Points.Route());
            double time = bus.time(Points.Route());
            System.out.print("Bus : " + "cost - " + costo + "$" + " ,time - " + time + " minutes\n");
        }
        if (man.moveToPoint(Points.Route())) {
            double time = man.time(Points.Route());
            System.out.print("Walk : " + "time - " + time + " minutes\n");
        }
        if (bicycle.moveToPoint(Points.Route())) {
            double time = bicycle.time(Points.Route());
            System.out.print("Bicycle : "  + "time - " + time + " minutes");
        }
    }
}