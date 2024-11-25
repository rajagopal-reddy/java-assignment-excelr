package com.excelr.java.oops;

abstract class Electric extends Car {

    private int batteryCapacity;

    public Electric(String brand, int speed, String fuel, String features, int batteryCapacity) {
        super(brand, speed, fuel, features);
        this.batteryCapacity = batteryCapacity;
    }


    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public abstract void battery();


}
