package Ants;

public abstract class Ant {
    private int xPos;
    private int yPos;

    private int distanceToQueen = xPos + yPos;


    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getDistanceToQueen() {
        return distanceToQueen;
    }

    public abstract void move();
}
