package org.example.vehicles;

import org.example.strategy.SportDriveStrategy;

public class offRoadVehicle extends Vehicle {
    public offRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
