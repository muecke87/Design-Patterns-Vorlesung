package com.builder;

public class App {
    public static void main(String[] args) {

        // price not relevant
        Vehicle motorCycle = new Vehicle(VehicleType.MOTORCYCLE, 0, 2, new Engine(100, 2, "unleaded"), 2);

        System.out.println("Motorcycle created: " + motorCycle);

        // engine not relevant
        Vehicle bicycle = new Vehicle(VehicleType.BICYCLE, 700, 1, null, 2);

        System.out.println("Bicycle created: " + bicycle);

        // wheels not relevant
        Vehicle snowmobile = new Vehicle(VehicleType.SNOWMOBILE, 1000, 5, new Engine(130, 4, "diesel"), 0);

        System.out.println("Snowmobile created: " + snowmobile);
    }
}
