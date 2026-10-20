package com.inheritance.vehicle;

 
//Child of LandVehicle)
public class CommercialVehicle extends LandVehicle {
    protected double loadCapacityInTons;

    public void loadCargo() {
        System.out.println("Loading cargo up to " + loadCapacityInTons + " tons.");
    }
}
