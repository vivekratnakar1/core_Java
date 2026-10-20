package com.inheritance.vehicle;

 
//(Child of LandVehicle)
public class FourWheeler extends LandVehicle {
    protected boolean hasAirConditioner;

    public FourWheeler() {
        this.wheels = 4; // Automatically sets wheels to 4
    }
}
