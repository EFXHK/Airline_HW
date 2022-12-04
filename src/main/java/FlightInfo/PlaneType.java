package FlightInfo;

public enum PlaneType {

    GALACTICA(330, 9900),
    PEGASUS(325, 9750),
    ASTRAL_QUEEN(65, 2600),
    COLONIAL_ONE(16, 800),
    OLYMPIC_CARRIER(134, 4690),
    BASESTAR(10, 1500);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
