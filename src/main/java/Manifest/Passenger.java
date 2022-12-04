package Manifest;

public class Passenger extends Human{

    private int numOfBags;

    public Passenger(String name, int numOfBags) {
        super(name);
        this.numOfBags = numOfBags;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public void setNumOfBags(int numOfBags) {
        this.numOfBags = numOfBags;
    }
}
