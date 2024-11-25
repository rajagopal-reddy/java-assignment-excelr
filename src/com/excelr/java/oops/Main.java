package com.excelr.java.oops;

public class Main {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar("BMW-i4", 350, "battery", "auto driving", 50000);
        car.drive();
        car.setSpeed(400);
        System.out.println("Speed increased: " + car.getSpeed());
        car.drive(20);
        car.drive("Hyderabad");
        car.fuelType();
        car.battery();
        car.features();

        System.out.println("------------------------------------------------");

        GasCar car1 = new GasCar("BMW-iX", 450, "diesel", "Off-Road", 60);
        car1.drive();
        car1.setSpeed(500);
        System.out.println("Speed increased: " + car1.getSpeed());
        car1.drive(85);
        car1.drive("Mumbai");
        car1.fuelType();
        car1.gas();
        car1.features();

        System.out.println("------------------------------------------------");

        ElectricBike car2 = new ElectricBike("BMW-Ce02", 340, "battery", "big battery", 10000);
        car2.drive();
        car2.setSpeed(440);
        System.out.println("Speed increased: " + car2.getSpeed());
        car2.drive(35);
        car2.drive("Goa");
        car2.fuelType();
        car2.battery();
        car2.features();

        System.out.println("------------------------------------------------");

        GasBike car3 = new GasBike("BMW-G310R", 470, "petrol", "250 kmph in 10sec", 40);
        car3.drive();
        car3.setSpeed(500);
        System.out.println("Speed increased: " + car3.getSpeed());
        car3.drive(40);
        car3.drive("Delhi");
        car3.fuelType();
        car3.gas();
        car3.features();
    }
}
