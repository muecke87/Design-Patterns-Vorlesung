package com.builder;

public class Engine {
    private int horsepower;
    private int cylinders;
    private String fuel;

    public Engine(int horsepower, int cylinders, String fuel) {
        this.horsepower = horsepower;
        this.cylinders = cylinders;
        this.fuel = fuel;
    }

    @Override
    public String
    toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                ", cylinders=" + cylinders +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
