package codecool.bacterias;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Spirillum extends Bacteria {


	public Spirillum(int posX, int posY) {
		super(posX, posY);
		this.type = BacteriaTypes.Spirillum;
		this.LIFE_SPAN = 40;
		this.NEARBY = 2;
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
				.filter(bacteria -> bacteria.getType() == BacteriaTypes.Bacillus)
				.collect(Collectors.toList());

		return nearbyBacteries.size() >= 1;
	}
}
