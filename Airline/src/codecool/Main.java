package codecool;

import codecool.Employee.FlightAttendant;
import codecool.Employee.Pilot;

import java.util.Date;

public class Main {

	public static void main(String[] args) {



		Flight firstOne = new Flight();

		System.out.println("Getting Ready");
		System.out.println("Flight Language is " + firstOne.getLanguage());

		Pilot pilot1 = new Pilot("Alex", "0785423123",new Date(1987-7-3), 2000, Pilot.Position.PILOT );
		Pilot pilot2 = new Pilot("Mihai", "0785423123",new Date(1987-7-3), 2000 , Pilot.Position.CO_PILOT);

		firstOne.addPilots(pilot1);
		System.out.println(pilot1.getName() + " on-board");
		firstOne.addPilots(pilot2);
		System.out.println(pilot2.getName() + " on-board");

		if (pilot1.hasCompas() && pilot2.hasCompas()) {
			System.out.println("both have compas");
		} else {
			System.out.println("compas is missing");
		}


		FlightAttendant flightAttendantOne = new FlightAttendant("Jane Doe1", "0729622232",new Date(1977-5-3), 3000);
		FlightAttendant flightAttendantTwo = new FlightAttendant("Janet Doe2","0729354633", new Date(1989-12-13),  2800);
		FlightAttendant flightAttendantThree = new FlightAttendant("Joanna Doe3", "0729697534", new Date(1992-6-23),  3200);

		firstOne.addAttendants(flightAttendantOne);
		firstOne.addAttendants(flightAttendantTwo);
		firstOne.addAttendants(flightAttendantThree);

		System.out.println("First FA speaks: " + flightAttendantOne.getLanguage() + " and " + flightAttendantOne.getLanguage2() + " and " + flightAttendantOne.getLanguage3());
		System.out.println("Second FA speaks: " + flightAttendantTwo.getLanguage() + " and " + flightAttendantTwo.getLanguage2()+ " and " + flightAttendantTwo.getLanguage3());
		System.out.println("Third FA speaks: " + flightAttendantThree.getLanguage() + " and " + flightAttendantThree.getLanguage2() + " and " + flightAttendantThree.getLanguage3());


		System.out.println("This flight has : " +  firstOne.getPassagersNo() + " passagers" );


		if      (pilot1.hasCompas() &&
				pilot2.hasCompas() &&
				firstOne.checkLanguage() &&
				firstOne.getPassagersNo() < 220 )
		{
			System.out.println("Ready to take off");
		} else {
			System.out.println("We need another Try");;
		}

	}
}
