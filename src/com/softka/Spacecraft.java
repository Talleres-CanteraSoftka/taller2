package com.softka;

/**
 * weight is the weight of the spacecraft in kilograms
 * name is the name of the spacecraft assigned by the users
 * thrust is the thrust of the spacecraft expressed in tons
 * crewsize is the number of astronauts that can board the spacecraft
 */
public abstract class Spacecraft {
    int weight;
    private String name;
    float thrust;
    int crewSize;

    /**
     *
     * @param weight is the weight of each type of ship
     * @param thrust
     * @param crewSize
     */
    public Spacecraft(int weight, float thrust, int crewSize) {
        this.weight = weight;
        this.thrust = thrust;
        this.crewSize = crewSize;
    }

    /**
     * this is the constructor used id main to create spacecrafts
     */
    public Spacecraft() {

    }

    /**
     *
     * @return name, returns the name assigned by the users after creating a ship.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name lets the user assign a name to their spacecrafts
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * fuelType is the fuel type or method of energy generation used by each spacecraft
     */
    public abstract String fuelType();

    /**
     *
     * SpacecraftDescription this method provides a short description of the spacecraft
     */
    public abstract String SpacecraftDescription();


}
