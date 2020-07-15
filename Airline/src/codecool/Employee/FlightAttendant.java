package codecool.Employee;

import codecool.Languages;

import java.util.Date;
import java.util.Random;

public class FlightAttendant extends AirlineEmployee {

	Languages language;
	Languages language2;
	Languages language3;

	public FlightAttendant(String name, String phoneNumber, Date birthDate, int salary) {
		super(name, phoneNumber, birthDate, salary);
		this.language = Languages.values()[new Random().nextInt(Languages.values().length)];
		this.language2 = Languages.values()[new Random().nextInt(Languages.values().length)];
		this.language3 = Languages.values()[new Random().nextInt(Languages.values().length)];
	}

	public Languages getLanguage2() {
		return language2;
	}

	public Languages getLanguage() {
		return language;
	}

	public Languages getLanguage3() {
		return language3;
	}
}
