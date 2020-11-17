package com.builder;

public class Vehicle {
    private VehicleType type;
    private double price;
    private int seats;
    private Engine engine;
    private int wheels;

    private Vehicle(Builder builder) {
        this.type = builder.type;
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.price = builder.price;
    }

    // nested static class
    public static class Builder {
        private VehicleType type;
        private double price;
        private int seats;
        private Engine engine;
        private int wheels;

        // mandatory properties in constructor
        public Builder(VehicleType type) {
            this.type = type;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder seats(int seats) {
            this.seats = seats;
            return this;
        }
        public Builder engine(Engine engine) {
            this.engine = engine;
            return this;
        }
        public Builder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
        public Vehicle build() {
            return new Vehicle(this);
        }
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
