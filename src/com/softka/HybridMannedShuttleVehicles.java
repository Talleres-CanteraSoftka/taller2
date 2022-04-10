package com.softka;

/**
 * this is the template to create a spacecraft of type  HybridMannedShuttleVehicles
 */
public class HybridMannedShuttleVehicles extends Spacecraft {
    /**
     * is the constructor used in main
     * weight is the weight assigned to this type of spacecraft
     * thrust is the thrust assigned to this type of spacecraft
     * crewSize is the crew size available to this type of spacecraft
     */
    public HybridMannedShuttleVehicles() {
        this.weight = 2400;
        this.thrust = 3060;
        this.crewSize = 7;

    }

    /**
     *
     *  this method overrides the fuel type used by this type of ship
     */
    @Override
    public String fuelType() {
        System.out.println("This spacecraft uses solid chemical fuel, liquid propellant, or both.");
        return "";
    }

    /**
     *
     * this method overrides the type of the spacecraft
     */
    @Override
    public String SpacecraftType() {
        System.out.println("This spacecraft is a combination of Manned Spacecraft and Shuttle Vehicles, which combines the ability to carry large payloads into space and the ability to carry people.");
        return "";
    }
}
