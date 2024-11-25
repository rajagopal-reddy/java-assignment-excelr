package com.excelr.java.oops;

public class GasBike extends Gas{
    public GasBike(String brand, int speed, String fuel, String features, int fuelCapacity) {
        super(brand, speed, fuel, features, fuelCapacity);
    }

    @Override
    public void gas() {
        System.out.println("Fuel capacity of " + getBrand() + " bike is " + getFuelCapacity() +" litres");
    }
}
