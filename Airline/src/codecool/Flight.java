package codecool;

import codecool.Employee.FlightAttendant;
import codecool.Employee.Pilot;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Flight {

    private int id;
    private int passagersNo;
    Languages language;
    int maxPilots = 2;
    int maxAttendants = 3;
    int maxPassangers = 220;
    AtomicInteger count = new AtomicInteger();


    Random r = new Random();
    private List<Pilot> pilotsList;
    private List<FlightAttendant> flightAttendants;

    public Flight() {
        this.id = count.incrementAndGet();
        this.passagersNo = r.nextInt(maxPassangers);
        this.language = Languages.values()[new Random().nextInt(Languages.values().length)];
    }

    public void addPilots(Pilot pilot) {
        pilotsList = new ArrayList<>();
        if (pilotsList.size() < maxPilots ) {
            pilotsList.add(pilot);
        } else {
            System.out.println("All pilots added");
        }
    }

    public void addAttendants(FlightAttendant flightAttendant) {
        flightAttendants = new ArrayList<>();
        if (flightAttendants.size() < maxAttendants ) {
            flightAttendants.add(flightAttendant);
        } else {
            System.out.println("All Flight Attendants Added added");
        }
    }

    public int getId() {
        return id;
    }

    public boolean checkLanguage () {
       return flightAttendants.stream()
                .allMatch(flightAttendant -> flightAttendant.getLanguage() == language || flightAttendant.getLanguage2() == language);
    }



    public int getPassagersNo() {
        return passagersNo;
    }


    public Languages getLanguage() {
        return language;

    }

}
