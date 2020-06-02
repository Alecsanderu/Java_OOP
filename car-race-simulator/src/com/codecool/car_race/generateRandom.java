package com.codecool.car_race;

import java.util.Random;

public class generateRandom {

    public static int generateRandomNumber(int low, int high) {
        Random random = new Random();
        return random.nextInt(high-low) + low;
    }


}
