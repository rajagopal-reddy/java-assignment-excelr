package com.excelr.java.oops;

abstract class Gas extends Car {
    private int fuelCapacity;

    public Gas(String brand, int speed, String fuel, String features, int fuelCapacity) {
        super(brand, speed, fuel, features);
        this.fuelCapacity = fuelCapacity;
    }


    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public abstract void gas();

}