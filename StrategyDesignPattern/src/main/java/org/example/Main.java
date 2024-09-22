package org.example;

import org.example.vehicles.Vehicle;
import org.example.vehicles.goodsVehicle;
import org.example.vehicles.offRoadVehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new offRoadVehicle();
        vehicle.drive();
    }
}