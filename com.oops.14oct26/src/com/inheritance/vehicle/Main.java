package com.inheritance.vehicle;
 

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- 1. Testing CAR (Multi-level) ---");
        AirVehicle myCar = new AirVehicle();
        myCar.brand = "Tata Safari";          // Inherited from Vehicle
        myCar.fuelType = "Diesel";           // Inherited from Vehicle
        myCar.hasAirConditioner = true;      // From FourWheeler
        myCar.start();                       // Inherited from Vehicle
        myCar.drive();                       // Inherited from LandVehicle
        myCar.openSunroof();                 // From Car itself

        System.out.println("\n--- 2. Testing BIKE (Multi-level) ---");
        Bike myBike = new Bike();
        myBike.brand = "Royal Enfield";      // Inherited from Vehicle
        myBike.start();                      // Inherited from Vehicle
        myBike.drive();                      // Inherited from LandVehicle
        myBike.kickStart();                  // From Bike itself

        System.out.println("\n--- 3. Testing TRUCK ---");
        Truck myTruck = new Truck();
        myTruck.brand = "Ashok Leyland";     // Inherited from Vehicle
        myTruck.loadCapacityInTons = 15.5;   // From CommercialVehicle
        myTruck.drive();                     // Inherited from LandVehicle
        myTruck.loadCargo();                 // From CommercialVehicle
        myTruck.blowAirHorn();               // From Truck itself
    }
}
