package com.codecool.car_race;


import com.codecool.car_race.vehicles.Car;
import com.codecool.car_race.vehicles.Motorcycle;
import com.codecool.car_race.vehicles.Truck;

public class Main {

    /**
     * Creates all the com.codecool.car_race.vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        for (int i = 0; i <10 ; i++) {
            Car car = new Car();
            race.registerRacer(car);
            Truck truck = new Truck();
            race.registerRacer(truck);
            Motorcycle motorcycle = new Motorcycle();
            race.registerRacer(motorcycle);

        }
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

        race.simulateRace(50);
        race.printRaceResults();
    }
}
