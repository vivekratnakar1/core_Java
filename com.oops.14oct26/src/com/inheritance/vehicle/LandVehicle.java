package com.inheritance.vehicle;


public class LandVehicle extends Vehicle {
    protected int wheels;

    public void drive() 
    {
        System.out.println("Driving on the road with " + wheels + " wheels.");
    }
}
