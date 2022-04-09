package com.softka;

public class HybridMannedShuttleVehicles extends Spacecraft {
    public HybridMannedShuttleVehicles(int weight, float thrust, int crewSize) {
        super(2400, 3060, 7);
    }

    @Override
    public String fuelType() {
        System.out.println("Esta nave espacial usa combustible químico sólido, propelente líquido, o ambos");
        return "";
    }

    @Override
    public String SpacecraftType() {
        System.out.println("Esta nave espacial es una combinación de MannedSpacecraft y Shuttle Vehicles, la cual combina la habilidad de llevar cargas grandes al espacio y la capacidad de llevar personas");
        return "";
    }
}
