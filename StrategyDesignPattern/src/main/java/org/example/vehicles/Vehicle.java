package org.example.vehicles;

import org.example.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    //construction injection
    Vehicle(DriveStrategy driveObj){
        this.driveStrategy = driveObj;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
