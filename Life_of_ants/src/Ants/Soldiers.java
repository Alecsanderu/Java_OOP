package Ants;

import java.util.Random;

public class Soldiers extends Ant {

    private static Random r = new Random();
    private int orientation;

    public Soldiers() {
        int x = r.nextInt(200) - 100;
        int y = r.nextInt(200) - 100;
        setxPos(x);
        setyPos(y);
        orientation = r.nextInt(4);
    }
    /*ants need to move random, The Soldiers normally just “patrol” close to their starting points; this means that
    in a 4-cycle they step one towards North, then East, South, and West, and then they start the cycle again.
    North - 0
    South - 1
    East - 2
    West - 3
    */

    @Override
    public void move() {
        switch (orientation) {
            case (0):
                setyPos(getyPos() + 1);
                break;
            case (1):
                setyPos(getyPos() - 1);
                break;
            case (2):
                setxPos(getxPos() + 1);
                break;
            case (3):
                setxPos(getxPos() - 1);
                break;
        }
    }
}
