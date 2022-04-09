package com.softka;

/**
 * weight is the weight of the spacecraft in kilograms
 * thrust is the thrust of the spacecraft expressed in tons
 */
public abstract class Spacecraft {
    private int weight;
    private String name;
    private float thrust;
    private int crewSize;

    public Spacecraft(int weight, float thrust, int crewSize) {
        this.weight = weight;
        this.thrust = thrust;
        this.crewSize = crewSize;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     *
     * String SpacecraftType es el metodo para establecer el tipo de combustible, este es un
     * metodo abastracto debido a que algunos tipos de naves espaciales tienen varios tipos de combustible y otros solo uno.
     */
    public abstract String fuelType();

    /**
     *
     * SpacecraftType es el tipo de nave espacial que se usara para constuir la nave espacial en Main
     */
    public abstract String SpacecraftType();


}
