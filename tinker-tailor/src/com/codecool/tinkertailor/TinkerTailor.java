package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class TinkerTailor {

    int n, k;
    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public List execute() {
        List<Integer> start = new ArrayList<>();
        List<Integer> outcome = new ArrayList<>();
        int position = 0;

        for (int i=1; i<=n; i++) {
            start.add(i);
        }

        for (int j=0;j<n-1;j++){
            position = (position+k-1)%start.size();
            outcome.add(start.get(position));
            start.remove(position);
        }
        outcome.add(start.get(0));
        return outcome;
    }
}