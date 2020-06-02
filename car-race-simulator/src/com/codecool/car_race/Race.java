package com.codecool.car_race;

import com.codecool.car_race.vehicles.Vehicles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Race {

    private static boolean isYellowFagActive;
    private static boolean isRaining = false;
    private List<Vehicles> wackyRacers = new ArrayList<>();

    //things that can go bad

    public static void  setIsYellowFagActive(boolean brokenTruck) {
         isYellowFagActive = brokenTruck;
    };
    public static boolean getisYellowFlagActive(){
        return isYellowFagActive;
    }

    public static void setRaining(boolean raining) {
        isRaining = raining;
    }

    public static boolean getIsRaining() {
        return isRaining;
    }

    public void registerRacer(Vehicles racer){
        wackyRacers.add(racer);
    }


    /**
     * Simulates the passing of time by advancing the weather and
     * moving the com.codecool.car_race.vehicles for the duration of a whole race.
     */
    public void simulateRace(int laps) {
        final int raining = 30;
        for (int i = 1; i <= laps; i++) {
            int rainDecision = generateRandom.generateRandomNumber(1, 60);
            System.out.println(" For This Lap(Lap NO. " + i + ") there are  " + rainDecision + " % chances of rain");
            if (rainDecision >= raining) {
                setRaining(true);
                System.out.println("Raining");
            } else  {
                System.out.println("Sun is up");
            }
            for (Vehicles wackyRacer : wackyRacers) {
                wackyRacer.moveForAnHour();
            }
        }
    }

    /**
     * Prints the state of all com.codecool.car_race.vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        List<Vehicles> allracers = wackyRacers;
        allracers.sort(Comparator.comparing(Vehicles::getdistanceTraveled));
        System.out.println();
        System.out.println("And the final results for the endurance race is: ");
        System.out.println();
        for (Vehicles allracer : allracers) {
            System.out.println(allracer.getVehicleType() + " " + allracer.getName() + " " + allracer.getdistanceTraveled());
        }
    }

}
