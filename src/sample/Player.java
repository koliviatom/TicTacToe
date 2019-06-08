package sample;

public class Player {
    private String name;
    private char marker;

    public Player(String n, char m) {
        name = n;
        marker = m;
    }

    public String getName() {
        return name;
    }

    public int getMarker() {
        return marker;
    }
}
