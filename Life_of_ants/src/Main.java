import Ants.Army;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Army ants = new Army();
        for (int i = 0; i <100 ; i++) {
            ants.move();
        }

    }
}
