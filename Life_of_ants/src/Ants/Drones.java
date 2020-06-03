package Ants;

import java.util.Random;

public class Drones extends Ant {

    private static Random r = new Random();

    public Drones() {
        int x = r.nextInt(200) - 100;
        int y = r.nextInt(200) - 100;
        setxPos(x);
        setyPos(y);
    }


    public void move(Queen queen) {
        if (getxPos() < 50) {
            setxPos((getxPos() + 1));
        } else if (getxPos() > 50) {
            setxPos(getxPos() - 1);
        }

        if (getyPos() < 50) {
            setyPos((getyPos() + 1));
        } else if (getyPos() > 50) {
            setyPos(getyPos() - 1);
        }
        if (queenIsNear() && queen.getInTheMood()) {
            System.out.println("HALLELUJAH");
            castDroneAway(queen);
        } else if (queenIsNear() && !queen.getInTheMood()) {
            System.out.println("D'oh");
            castDroneAway(queen);
        }
    }


    public boolean queenIsNear() {
        return Math.abs(getxPos()) + Math.abs(getyPos()) <= 47;
    }

    public void castDroneAway(Queen queen){
        setyPos(queen.getyPos() - r.nextInt(51) + 50);
        setxPos(queen.getxPos() - r.nextInt(51) + 50);
    }

    @Override
    public void move() {}
}