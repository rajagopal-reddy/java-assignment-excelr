package com.excelr.java.oops;

import com.excelr.java.oops.Vehicle;

public class Bike implements Vehicle {

    private String brand;
    private int speed;
    private String fuel;
    private String features;

    public Bike(String brand, int speed, String fuel, String features) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.features = features;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public void drive(int distance){
        System.out.println(brand+ " bike travelled " + distance + " km");
    }

    public void drive(String destination){
        System.out.println(brand + " bike has travelled to " + destination);
    }

    @Override
    public void drive() {
        System.out.println(brand+ " bike travels at speed " + speed);
    }

    @Override
    public void fuelType(){
        System.out.println(getBrand() + " bike Uses "+getFuel() + " as fuel !");
    }

    @Override
    public void features(){
        System.out.println(getBrand() + " bike has " + getFeatures() + " feature !");
    }
}
