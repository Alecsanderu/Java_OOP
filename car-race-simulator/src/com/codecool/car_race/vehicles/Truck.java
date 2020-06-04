package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.generateRandom;

public class Truck extends Vehicles{

    private int name;
    private int normalSpeed;
    private int breakChance = 5;
    private int distanceTraveled;
    private int lapsToWait = 0;
    String vehicleType;


    public Truck(){
        this.name = generateRandom.generateRandomNumber(0,1001);
        this.normalSpeed = 100;
        this.vehicleType = "Truck";
        this.distanceTraveled = 0;
    }
    @Override
    public String getName() {
        return String.valueOf(name);
    }

    @Override
    public void prepareForLap() {
        int breakDown = generateRandom.generateRandomNumber(1, 101);
        if (breakDown <= breakChance) {
            lapsToWait = 2;
        }
        if (lapsToWait > 0 ) {
            lapsToWait--;
            normalSpeed = 0;
            Race.setIsYellowFagActive(true);
        } else {
            normalSpeed = 100;
        }
    }

    @Override
    public void moveForAnHour() {
        prepareForLap();
        setDistanceTraveled(normalSpeed);
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void setDistanceTraveled(int speed) {
        distanceTraveled += speed;
    }

    public int getdistanceTraveled(){
        return distanceTraveled;
    }

}
