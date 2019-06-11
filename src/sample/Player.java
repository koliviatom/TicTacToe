package sample;

public class Player {
    private String name;
    private char marker;
    private boolean turn;

    public Player(String n, char m, boolean t) throws IllegalTic {
        setName(n);
        setMarker(m);
        setTurn(t);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalTic {
        if (name.length() > 20)
            throw new IllegalTic("Name too long!");
        this.name = name;
    }

    public char getMarker() { return marker; }

    public void setMarker(char m) throws IllegalTic {
        if (m != 'O' && m != 'X')
            throw new IllegalTic("Illegal marker option!");
        marker = m;
    }

    public boolean getTurn() {
        return turn;
    }

    public void setTurn(boolean t) {
        turn = t;
    }
}
