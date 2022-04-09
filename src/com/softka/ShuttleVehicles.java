package com.softka;
// tipo de combustilbe combustible químico sólido o bien propelente líquido, o ambos
// podía transportar 100 toneladas,
// y tenía un empuje de 3060 toneladas.
// medía 60 metros
// pesaba 2400 toneladas
public class ShuttleVehicles extends Spacecraft{
    public ShuttleVehicles(int weight, float thrust, int crewSize) {
        super(2400, 3060, 4);
    }

    @Override
    public String fuelType() {
        System.out.println("Esta nave espacial usa combustible químico sólido, propelente líquido, o ambos");
        return "";
    }

    @Override
    public String SpacecraftType() {
        System.out.println("Esta nave espacial es del tipo Shuttle Vehicles, que sirve para lanzar una carga útil al espacio");
        return "";
    }
    public String LoadCapacity(){
        System.out.println( "Esta nave espacial tiene una capacidad de carga de 100 toneladas");
        return "";
    }

}
