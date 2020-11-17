package com.builder;

public class App {
    public static void main(String[] args) {
        Vehicle motorCycle = new Vehicle
                .Builder(VehicleType.MOTORCYCLE)
                    .engine(new Engine(100, 2, "unleaded"))
                    .seats(2)
                    .wheels(2)
                    .build(); // creates new instance of Vehicle and returns it

        System.out.println("Motorcycle created via Builder: " + motorCycle);

        Vehicle bicycle = new Vehicle
                .Builder(VehicleType.BICYCLE)
                    .seats(1)
                    .price(700)
                    .wheels(2)
                    .build();

        System.out.println("Bicycle created via Builder: " + bicycle);

        Vehicle snowmobile = new Vehicle
                .Builder(VehicleType.SNOWMOBILE)
                    .seats(5)
                    .price(1000)
                    .engine(new Engine(130, 4, "diesel"))
                    .build();

        System.out.println("Snowmobile created via Builder: " + snowmobile);
    }
}
