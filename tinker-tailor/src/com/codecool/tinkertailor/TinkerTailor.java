package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

class TinkerTailor {

    int n, k;

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public List execute() {
        List<Integer> outcome = new ArrayList<>();

        outcome.add(3);
        outcome.add(1);
        outcome.add(5);
        outcome.add(2);
        outcome.add(4);

        // Works for n = 5 and k = 3
        // Well, you should come up with a more general algorithm :)

        return outcome;
    }
}