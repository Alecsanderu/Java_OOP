package com.codecool.car_race.vehicles;


import com.codecool.car_race.Race;
import com.codecool.car_race.generateRandom;



public class Car extends Vehicles{

    private String name;
    private int normalSpeed;
    public int distanceTraveled;
    String vehicleType;

    public Car(){
        this.name = randomCarNames();
        this.normalSpeed = generateRandom.generateRandomNumber(80,110);
        this.vehicleType = "Car";
        this.distanceTraveled = 0;
    }

    @Override
    public void prepareForLap() {
        if (Race.getisYellowFlagActive()) {
            this.normalSpeed = 75;
        }
    }

    @Override
    public void moveForAnHour() {
        prepareForLap();
        setDistanceTraveled(this.normalSpeed);
    }

    @Override
    public void setDistanceTraveled(int normalSpeed) {
        distanceTraveled += normalSpeed;
    }

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public int getdistanceTraveled() {
        return this.distanceTraveled;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getName() {
        return name;
    }

    private String randomCarNames(){

        // car names from wacky racers cartoon
        String[] carNames = {"Mean Machine", "Compact Pussycat", "Boulder Mobile", "Arkansas Chuggabug", "Convert-a-Car", "Creepy Coupe" , "Army Surplus Special", "Bulletproof Bomb", "Buzzwagon", "Crimson Haybaler"};
        String name = "";

        //random number between 0(inclusive) and names.length(exclusive, as i work with indexes)
        int number = generateRandom.generateRandomNumber(0, carNames.length);
        name += carNames[number];
        return name;
    };
}
