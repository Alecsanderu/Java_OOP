package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class TinkerTailor {

    int n, k;
    private List<Integer> numbers = new ArrayList<Integer>();

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public List execute() {
        List<Integer> outcome = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        if (outcome.size() == n) {
            System.out.println(outcome);
        } else {
            for ( int j=0; j< k; j++) {
                outcome.add(numbers.get(0));
                numbers.remove(0);

            }
            outcome.add(numbers.get(0));
        }

        return outcome;
    }
}