package com.company;

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
        Car car = new Car();
        Bus bus = new Bus();
        Walk man = new Walk();
        Bicycle bicycle = new Bicycle();
        if (car.moveToPoint()) {
            System.out.print("Car : " + "cost - " + car.cost() + "$" + " ,time - " + car.time() + " minutes\n");
        }
        if (bus.moveToPoint()) {
            System.out.print("Bus : " + "cost - " + bus.cost() + "$" + " ,time - " + bus.time() + " minutes\n");
        }
        if (man.moveToPoint()) {
            System.out.print("Walk : " + "cost - " + man.cost() + "$" + " ,time - " + man.time() + " minutes\n");
        }
        if (bicycle.moveToPoint()) {
            System.out.print("Bicycle : " + "cost - " + bicycle.cost() + "$" + " ,time - " + bicycle.time() + " minutes");
        }
    }
}
