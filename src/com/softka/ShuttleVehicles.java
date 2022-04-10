package com.softka;

/**
 * ShuttleVehicles is a class used to build spacecrafts of this type
 */
public class ShuttleVehicles extends Spacecraft{


    /**
     * is the constructor used in main
     * weight is the weight assigned to this type of spacecraft
     * thrust is the thrust assigned to this type of spacecraft
     * crewSize is the crew size available to this type of spacecraft
     */
    public ShuttleVehicles() {
        this.weight = 2400;
        this.thrust = 3060;
        this.crewSize = 4;
    }

    /**
     *
     * this method overrides the fuel type of this spacecraft
     */
    @Override
    public String fuelType() {
        System.out.println("This spacecraft uses solid chemical fuel, liquid propellant, or both.");
        return "";
    }

    /**
     *
     * this method assigns a type to the spacecraft
     */
    @Override
    public String SpacecraftType() {
        System.out.println("This spacecraft is of the Shuttle Vehicles type, which is used to launch a payload into space");
        return "";
    }


}
