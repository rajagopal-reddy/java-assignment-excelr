package com.excelr.java.oops;

public class GasCar extends Gas{

    public GasCar(String brand, int speed, String fuel, String features, int fuelCapacity) {
        super(brand, speed, fuel, features, fuelCapacity);
    }

    @Override
    public void gas() {
        System.out.println("Fuel capacity of " + getBrand() + " car is " + getFuelCapacity() +" litres");
    }

}
