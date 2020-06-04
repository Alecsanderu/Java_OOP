package Ants;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Ant> Ants = new ArrayList<>();
    private Queen queen = new Queen();

    public Army() {
        for (int i = 0; i < 5; i++) {
            Ants.add(new Drones());
            Ants.add(new Workers());
            Ants.add(new Soldiers());
        }
    }

    public void move() throws InterruptedException {
        for (Ant ant : Ants) {
            if (ant instanceof Drones) {
                ((Drones) ant).move(getQueen());
            } else {
                ant.move();
            }
        }
        queen.move();
    }

    public Queen getQueen() {
        return queen;
    }
}
