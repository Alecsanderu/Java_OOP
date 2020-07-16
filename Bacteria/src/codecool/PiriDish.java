package codecool;

import codecool.bacterias.Bacillus;
import codecool.bacterias.Bacteria;
import codecool.bacterias.Coccus;


import java.util.*;



public class PiriDish {

	private List<Bacteria> bacteries = new ArrayList<>();
	private int timePulse = 0;
	Random r = new Random();

	public PiriDish() {
	}

	public List<Bacteria> getBacteries() {
		return bacteries;
	}

	public void addBacteries(Bacteria bacteria) {
		bacteries.add(bacteria);
	}

	public void multiply() {
		timePulse++;
		ListIterator<Bacteria> itr = bacteries.listIterator();
		while (itr.hasNext()) {
			Bacteria toBeRemoved = itr.next();
			if (timePulse % toBeRemoved.getLIFE_SPAN() == 0) {
				itr.remove();

				if (toBeRemoved instanceof Bacillus) {
					Bacillus newBacteria = new Bacillus(randPoint(toBeRemoved.getNEARBY(), toBeRemoved.getPosX()), randPoint(toBeRemoved.getNEARBY(), toBeRemoved.getPosY()));
					Bacillus newBacteria2 = new Bacillus(randPoint(toBeRemoved.getNEARBY(), toBeRemoved.getPosX()), randPoint(toBeRemoved.getNEARBY(), toBeRemoved.getPosY()));
					itr.add(newBacteria);
					itr.add(newBacteria2);
				}
				if (toBeRemoved instanceof Coccus) {
					Coccus newBacteriaC = new Coccus(randPoint(toBeRemoved.getNEARBY(), toBeRemoved.getPosX()), randPoint(toBeRemoved.getNEARBY(), toBeRemoved.getPosY()));
					Coccus newBacteriaC2 = new Coccus(randPoint(toBeRemoved.getNEARBY(), toBeRemoved.getPosX()), randPoint(toBeRemoved.getNEARBY(), toBeRemoved.getPosY()));
					itr.add(newBacteriaC);
					itr.add(newBacteriaC2);
				}
			}
		}
		System.out.println(bacteries.size());
	}


		public int randPoint ( int R, int coordinate){
			double len = Math.sqrt(Math.random()) * R;
			double deg = Math.random() * 2 * Math.PI;
			return (int) (coordinate + len * Math.cos(deg));
		}
	}



