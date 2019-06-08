
package sample;
import java.lang.*;


public class Board {

    char[][] gameBoard;

    public Board() {
        char[][] gameBoard = new char[3][3];
    }

    public char[][] getGameBoard() {
        return gameBoard;
    }

    public boolean checkForWinner( ) {
        if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2])
            return true;
        if(gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2])
            return true;
        for (int i = 0; i < 3; i++) {
            if(gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][0] == gameBoard[i][2])
                return true;
            if(gameBoard[0][i] == gameBoard[1][i] && gameBoard[0][i] == gameBoard[2][i])
                return true;
        }
        return false;
    }
    
}
