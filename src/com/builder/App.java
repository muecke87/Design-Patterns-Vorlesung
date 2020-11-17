package com.builder;

public class App {
    public static void main(String[] args) {
        Vehicle motorCycle = new Vehicle
                .Builder()
                    .engine(new Engine(100, 2, "unleaded"))
                    .seats(2)
                    .type(VehicleType.MOTORCYCLE)
                    .wheels(2)
                    .build();

        System.out.println("Motorcycle created via Builder: " + motorCycle);

        Vehicle bicycle = new Vehicle
                .Builder()
                    .seats(1)
                    .type(VehicleType.BICYCLE)
                    .wheels(2)
                    .build();

        System.out.println("Bicycle created via Builder: " + bicycle);

        Vehicle snowmobile = new Vehicle
                .Builder()
                    .seats(5)
                    .type(VehicleType.SNOWMOBILE)
                    .engine(new Engine(130, 4, "diesel"))
                    .build();

        System.out.println("Snowmobile created via Builder: " + snowmobile);
    }
}
