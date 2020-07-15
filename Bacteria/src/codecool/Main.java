package codecool;

import codecool.bacterias.Bacillus;

import codecool.bacterias.Coccus;



public class Main {


    public static void main(String[] args) {

        PiriDish piriDish = new PiriDish();

        Coccus coccus1 = new Coccus(2, 4);
        Bacillus bacillus1 = new Bacillus(3, 5);

        piriDish.addBacteries(coccus1);
        piriDish.addBacteries(bacillus1);


        piriDish.multiply(500);






    }
}
