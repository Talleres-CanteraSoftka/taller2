package com.softka;

/**
 * this class is the template to create Unmanned Spacecrafts
 */
public class UnmannedSpacecraft extends Spacecraft {


    /**
     * is the constructor used in main
     * weight is the weight assigned to this type of spacecraft
     * thrust is the thrust assigned to this type of spacecraft
     * crewSize is the crew size available to this type of spacecraft
     */
    public UnmannedSpacecraft() {
        this.weight = 258;
        this.thrust = 0.2f;
        this.crewSize = 0;
    }
    /**
     *
     * this method overrides the fuel type of this spacecraft
     */
    @Override
    public String fuelType() {
        System.out.println("This type of spacecraft uses photovoltaic cells to produce energy and generate its movement.");
        return "";
    }
    /**
     *
     * this method overrides the type of the spacecraft
     */
    @Override
    public String SpacecraftType() {
        System.out.println("This spacecraft is of the Unmanned Spacecraft type, which are generally used to study celestial bodies");
        return "";
    }
}

