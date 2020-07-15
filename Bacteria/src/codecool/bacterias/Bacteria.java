package codecool.bacterias;

import java.util.List;
import java.util.Map;

public abstract class Bacteria {


	public int LIFE_SPAN;
	private int posX;
	private int posY;
	public int NEARBY;
	public BacteriaTypes type;

	public Bacteria(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getNEARBY() {
		return NEARBY;
	}
	public BacteriaTypes getType() {
		return type;
	}
	public int getLIFE_SPAN() {
		return LIFE_SPAN;
	}
	public abstract boolean checkNearbyBacteria(Map<Bacteria, Integer> bacteries);


	@Override
	public String toString() {
		return  "" +type;

	}
}
