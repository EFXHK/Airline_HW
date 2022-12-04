package Manifest;

public class CabinCrewMember extends Human{

    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public String speak(String giveInstructions) {
        return String.format("%s", giveInstructions);
    }
}
