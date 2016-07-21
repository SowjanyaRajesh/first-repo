package com.isoftechtraining;

/**
 * Created by Rajesh on 6/25/2016.
 */
public class Bicycle {

    public int cadence;
    public int gear;
    public int speed;


    // the Bicycle class has
    // one constructor
    // constructor overload
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

    }

    public Bicycle() {

    }

    public void printDescription()
    {
        System.out.println(cadence +" "+ gear+" " + speed);
    }


    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }


}
