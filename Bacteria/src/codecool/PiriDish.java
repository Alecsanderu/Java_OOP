package codecool;

import codecool.bacterias.Bacteria;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class PiriDish{

	private ConcurrentHashMap<Bacteria, Integer> bacteries = new ConcurrentHashMap<>();
	private int timePulse = 1;
	private Random r = new Random();

	public PiriDish() {
	}


	public void addBacteries(Bacteria bacteria) {
		bacteries.merge(bacteria, 1,Integer::sum);

	}

	public void  multiply(int number){
		for (int i = 0; i < number ; i++) {
			timePulse++;
			for(Bacteria bacteria: bacteries.keySet()){
				if (timePulse % bacteria.getLIFE_SPAN() == 0 || bacteria.checkNearbyBacteria(bacteries)){
					//bacteria dies
					int currentBacteriaNumber = bacteries.get(bacteria);
					bacteries.put(bacteria, currentBacteriaNumber - 1);
					//bacteria multiplies twice
					bacteria.setPosX(r.nextInt(bacteria.getNEARBY()));
					bacteria.setPosY(r.nextInt(bacteria.getNEARBY()));
					bacteries.put(bacteria, bacteries.get(bacteria) + 2);
				}
			}
			bacteries.entrySet().forEach(entry->{
				System.out.println(entry.getKey().getType() + " " + entry.getValue());
			});
		}
	}

	public ConcurrentHashMap<Bacteria, Integer> getBacteries() {
		return bacteries;
	}
}
