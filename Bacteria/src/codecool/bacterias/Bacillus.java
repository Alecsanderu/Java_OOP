package codecool.bacterias;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Bacillus extends Bacteria {



	public Bacillus(int posX, int posY) {
		super( posX, posY);
		this.type = BacteriaTypes.Bacillus;
		this.LIFE_SPAN = 10;
		this.NEARBY = 3;

	}

	@Override
	public boolean checkNearbyBacteria(List<Bacteria> bacteriesList) {
		List<Bacteria> nearbyBacteries = new ArrayList<>();
		for (Bacteria bacteria : bacteriesList){
			int currentBacteria = Math.abs(bacteria.getPosX() - getPosX()) +
					              Math.abs(bacteria.getPosY() - getPosY());
			if (currentBacteria <= getNEARBY()){
				nearbyBacteries.add(bacteria);
			}
		}
		 List<Bacteria> filtered = nearbyBacteries.stream()
						.filter(bacteria -> bacteria.getType() == BacteriaTypes.Coccus)
						.collect(Collectors.toList());

		return filtered.size() >= 1;
	}
}
