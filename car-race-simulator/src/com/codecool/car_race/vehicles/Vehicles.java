package com.codecool.car_race.vehicles;

public abstract class Vehicles implements VehiclesInterface {

    private int distanceTraveled;

    public Vehicles() {
        this.distanceTraveled = 0;
    }

    public abstract String getName();

    public abstract void prepareForLap();

    public abstract void moveForAnHour();

    public int getdistanceTraveled() {
        return this.distanceTraveled;
    }

    @Override
    public void setDistanceTraveled(int speed){
        this.distanceTraveled += speed;
    }


}