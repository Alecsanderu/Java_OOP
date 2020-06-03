package Ants;

import java.util.Random;

public class Workers extends Ant{

    private static Random r = new Random();

    public Workers (){
        int x = r.nextInt(200) - 100;
        int y = r.nextInt(200) - 100;
        setxPos(x);
        setyPos(y);
    }

    /*ants need to move random, The Workers normally make one step randomly in one of the four directions.
    UP - 0
    DOWN - 1
    LEFT - 2
    RIGHT - 3
    */

    @Override
    public void move() {
        int direction = r.nextInt(4);
        switch (direction) {
            case (0):
                setyPos(getyPos() + 1);
                break;
            case (1):
                setyPos(getyPos() - 1);
                break;
            case (2):
                setxPos(getxPos() - 1);
                break;
            case (3):
                setxPos(getxPos() + 1);
                break;
        }
    }
}
