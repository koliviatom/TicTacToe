package sample;

public class GamePlay {
    private final Player p1;
    private final Player p2;
    private Board gameboard;

    public GamePlay(Player p1, Player p2, Board board) {
        this.p1 = p1;
        this.p2 = p2;
        this.gameboard = board;
    }

    public boolean playersTurn(Player p) {
        return p.getTurn();
    }

    public void swapPlayers() {
        if(playersTurn(p1)) {
            p1.setTurn(false);
            p2.setTurn(true);
        } else {
            p1.setTurn(true);
            p2.setTurn(false);
        }
    }

    public char getCurrentMarker() {
        if (p1.getTurn())
            return p1.getMarker();
        if (p2.getTurn())
            return p2.getMarker();
        return 0;
    }


}
