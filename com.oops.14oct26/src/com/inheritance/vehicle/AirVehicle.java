package com.inheritance.vehicle;
  
//(Child of LandVehicle)
public class AirVehicle extends Vehicle
{
    protected double maxAltitude;
	public boolean hasAirConditioner;

    public void fly() {
        System.out.println("Flying in the sky at " + maxAltitude + " feet.");
    }

	public void drive() {
		// TODO Auto-generated method stub
		
	}

	public void openSunroof() {
		// TODO Auto-generated method stub
		
	}
}
