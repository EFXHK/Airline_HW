package Manifest;

public class Pilot extends CabinCrewMember{

    private String licenceNumber;
    private String flyPlane;

    public Pilot(String name, Rank rank, String licenceNumber, String flyPlane) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
        this.flyPlane = flyPlane;
    }

    public String getLicenceNumber() {

        return licenceNumber;
    }

    public String flyPlane(String startFlight) {
        return String.format("%s", startFlight);
    }
}
