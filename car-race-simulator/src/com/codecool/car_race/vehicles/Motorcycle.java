package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.generateRandom;

public class Motorcycle extends Vehicles {

    private String name;
    private int actualSpeed;
    public int distanceTraveled;
    String vehicleType;

    public Motorcycle() {
        this.name = "Motorcycle " + generateRandom.generateRandomNumber(0, 11);
        this.actualSpeed = 100;
        this.vehicleType = "Motorcycle";
        this.distanceTraveled = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void prepareForLap() {
        int slowDown = generateRandom.generateRandomNumber(5, 51);
        if (Race.getIsRaining()) {
            actualSpeed = slowDown;
        } else {
            actualSpeed = 100;
        }
    }

    @Override
    public void moveForAnHour() {
        prepareForLap();
        setDistanceTraveled(actualSpeed);
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void setDistanceTraveled(int speed) {
        distanceTraveled += speed;
    }

    public int getdistanceTraveled() {
        return distanceTraveled;
    }
}
