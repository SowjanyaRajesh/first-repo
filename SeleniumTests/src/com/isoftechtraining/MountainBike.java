package com.isoftechtraining;

/**
 * Created by Rajesh on 6/25/2016.
 */
public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike( int startCadence,           int startSpeed,            int startGear,           String suspensionType) {
        super(startCadence,                startSpeed,                startGear);

        this.setSuspension(suspensionType);
    }

    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();   //cg,s
        System.out.println("The " + "MountainBike has a" +
                getSuspension() + " suspension.");
    }



}
