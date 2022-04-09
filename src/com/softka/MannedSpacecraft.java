package com.softka;

public class MannedSpacecraft extends Spacecraft {
    public MannedSpacecraft(int weight, float thrust, int crewSize) {
        super(77, 0, 7);
    }

    @Override
    public String fuelType() {
        System.out.println(" Esta nave espacial no tiene combustible, debido a que se usa en conjunto con otra nave espacial");
        return "";
    }

    @Override
    public String SpacecraftType() {
        System.out.println("Esta nave espacial es del tipo Shuttle Vehicles, que sirve para lanzar una carga útil al espacio");
        return null;
    }
    // pesaba 77 toneladas
    //
}
