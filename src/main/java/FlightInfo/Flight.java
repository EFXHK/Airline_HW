package FlightInfo;

import Manifest.CabinCrewMember;
import Manifest.Passenger;
import Manifest.Pilot;

import java.util.ArrayList;

public class Flight {

    public String planeType;
    public String flightNumber;
    public String destination;
    public String origin;
    public String departureTime;

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;

    public Flight(String planeType, String flightNumber, String destination, String origin, String departureTime) {
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.departureTime = departureTime;
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public String getPlaneType() {
        return this.planeType;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getOrigin() {
        return this.origin;

    }

    public int passengerListSize() {
        return this.passengers.size();
    }

//    public void checkInPassenger(Passenger passenger) {
//        if (this.passengerListSize() < this.capacity) {
//            this.passengers.add(passenger);
//        }
//    }

    public boolean isOccupied() {
        return this.passengerListSize() > 0;
    }

    public boolean isVacant() {
        return this.passengerListSize() == 0;

    }
}
