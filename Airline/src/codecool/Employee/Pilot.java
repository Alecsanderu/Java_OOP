package codecool.Employee;


import java.util.Date;
import java.util.Random;

public class Pilot extends AirlineEmployee {

	private boolean hasCompas;
	private Position position;
	private Random r = new Random();


	public Pilot(String name, String phoneNumber, Date birthDate, int salary, Position position) {
		super(name, phoneNumber, birthDate, salary);
		setPilotPosition(position);
	}


	private void setPilotPosition(Position position) {
		this.position = position;
	}

	public boolean hasCompas() {
		return r.nextBoolean();
	}

	public enum Position {
		PILOT,
		CO_PILOT;
	}
}
