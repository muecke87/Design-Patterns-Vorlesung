package com.builder;

public class Vehicle {
    private VehicleType type;
    private double price;
    private int seats;
    private Engine engine;
    private int wheels;

    public Vehicle(VehicleType type) {
        this.type = type;
    }

    public Vehicle(VehicleType type, double price, int seats, Engine engine, int wheels) {
        this.type = type;
        this.price = price;
        this.seats = seats;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type=" + type +
                ", price=" + price +
                ", seats=" + seats +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
