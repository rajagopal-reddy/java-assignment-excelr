package com.excelr.java.oops;

public class ElectricCar extends Electric{

    public ElectricCar(String brand, int speed, String fuel, String features, int batteryCapacity) {
        super(brand, speed, fuel, features, batteryCapacity);
    }

    @Override
    public void battery() {
        System.out.println("Battery capacity of " + getBrand() + " car is " + getBatteryCapacity() +" kWh");
    }

}
