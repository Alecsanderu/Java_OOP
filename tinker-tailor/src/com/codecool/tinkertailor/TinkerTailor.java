package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class TinkerTailor {

    int n, k;
    private List<Integer> numbers = new ArrayList<Integer>();

    public TinkerTailor(int n, int k) {
        Random rand = new Random();
        this.n = n;
        this.k = k;
        for (int i = 1; i <= n ; i++) {
            numbers.add(rand.nextInt(50));
        }
        System.out.println(numbers);
    }

    public List execute() {
        List<Integer> outcome = new ArrayList<>();

        if (outcome.size() == n) {
            System.out.println(outcome);
        } else {
            for ( int j=0; j< k; j++) {
                numbers.add(numbers.get(0));
                numbers.remove(0);
            }
            outcome.add(numbers.get(0));
            numbers.remove(0);
        }

        return outcome;
    }
}