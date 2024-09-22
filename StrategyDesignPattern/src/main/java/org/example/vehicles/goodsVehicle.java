package org.example.vehicles;

import org.example.strategy.NormalDriveStrategy;

public class goodsVehicle extends Vehicle {
    public goodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
