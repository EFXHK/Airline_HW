package FlightInfo;

public class Plane {

    private PlaneType planeType;


    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getType() {
        return planeType;
    }

    public int getCapacity() {
        return planeType.getCapacity();
    }

    public int getTotalWeight() {
        return planeType.getTotalWeight();
    }

}
