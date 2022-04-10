package com.softka;

/**
 * this is the template used to create Manned Spacecraft objects
 */
public class MannedSpacecraft extends Spacecraft {
    /**
     * is the constructor used in main
     * weight is the weight assigned to this type of spacecraft
     * thrust is the thrust assigned to this type of spacecraft
     * crewSize is the crew size available to this type of spacecraft
     */
    public MannedSpacecraft() {
        this.weight = 77;
        this.thrust = 0;
        this.crewSize = 7;
    }

    /**
     *
     * this method overrides the fuel type used by this type of ship
     */
    @Override
    public String fuelType() {
        System.out.println(" This spaceship has no fuel, due to being used in conjunction with another spaceship");
        return "";
    }

    /**
     *
     * this method overrides the type of the spacecraft
     */
    @Override
    public String SpacecraftType() {
        System.out.println("This spacecraft is of the Shuttle Vehicles type, which is used to launch a payload into space");
        return null;
    }

}
