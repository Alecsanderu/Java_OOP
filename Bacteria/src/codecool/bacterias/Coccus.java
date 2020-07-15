package codecool.bacterias;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Coccus extends Bacteria {


	public Coccus(int posX, int posY) {
		super(posX, posY);
		this.type = BacteriaTypes.Coccus;
		this.LIFE_SPAN = 100;
		this.NEARBY = 1;
	}

	@Override
	public boolean checkNearbyBacteria(Map<Bacteria, Integer> bacteries) {
		List<Bacteria> nearbyBacteries = new ArrayList<>();
		for (Bacteria bacteria : bacteries.keySet()){
			int currentBacteria = Math.abs(bacteria.getPosX() - getPosX()) +
					Math.abs(bacteria.getPosY() - getPosY());
			if (currentBacteria <= getNEARBY()){
				nearbyBacteries.add(bacteria);
			}
		}
		nearbyBacteries.stream()
				.filter(bacteria -> bacteria.getType() == BacteriaTypes.Spirillum
				&& bacteria.getType() == BacteriaTypes.Bacillus)
				.collect(Collectors.toList());


		return nearbyBacteries.size() >= 2;

	}
}
