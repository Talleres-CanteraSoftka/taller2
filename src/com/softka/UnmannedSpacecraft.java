package com.softka;
// no precisan de combustible— los satélites suelen emplear celdas fotovoltaicas
// empuje de 0,2 toneladas.

public class UnmannedSpacecraft extends Spacecraft {


    public UnmannedSpacecraft(int weight, float thrust, int crewSize) {
        super(258, 0.2f, 0);
    }

    @Override
    public String fuelType() {
        System.out.println("Este tipo de nave espacial utiliza celdas fotovoltacias para producir energia y generar su movimiento");
        return "";
    }

    @Override
    public String SpacecraftType() {
        System.out.println("Esta nave espacial es del tipo Unmanned Spacecraft, las cuales generalmente se usan para estudiar cuerpos celestes");
        return "";
    }
}

