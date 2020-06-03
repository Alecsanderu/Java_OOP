package Ants;

import java.util.Random;

public class Queen extends Ant {

    private static Random r = new Random();
    private boolean inTheMoodTo;
    private int stepsToTheMood;
    private int stepsToMate = r.nextInt(100) + 100;

    @Override
    public void move() {
        setxPos(50);
        setyPos(50);
        setStepsToTheMood(stepsToMate);
        while (stepsToMate > 0) {
            letsMate();
        }
    }

    public boolean getInTheMood() {
        return inTheMoodTo;
    }

    public void setInTheMoodTo(boolean inTheMoodTo) {
        this.inTheMoodTo = inTheMoodTo;
    }

    public int getStepsToTheMood() {
        return stepsToTheMood;
    }

    public void setStepsToTheMood(int stepsToTheMood) {
        this.stepsToTheMood = stepsToTheMood;
    }

    public void letsMate (){
        setInTheMoodTo(false);
        stepsToMate--;
        if(stepsToMate == 0) {
            setInTheMoodTo(true);
        }
    }
}
