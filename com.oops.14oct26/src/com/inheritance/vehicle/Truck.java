package com.inheritance.vehicle;

//CommercialVehicle

public class Truck extends CommercialVehicle {
    public Truck() {
        this.wheels = 6; // Heavy trucks can have 6 or more wheels
    }
    
    public void blowAirHorn() {
        System.out.println(brand + " Truck goes: POOP POOOOP!");
    }
}
