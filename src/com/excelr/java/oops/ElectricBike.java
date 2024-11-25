package com.excelr.java.oops;

public class ElectricBike extends Electric {

    public ElectricBike(String brand, int speed, String fuel, String features, int batteryCapacity) {
        super(brand, speed, fuel, features, batteryCapacity);
    }

    @Override
    public void battery() {
        System.out.println("Battery capacity of " + getBrand() + " bike is " + getBatteryCapacity() +" kWh");
    }
}
