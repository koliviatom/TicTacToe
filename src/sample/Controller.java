package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    Player playx;
    {
        try {
            playx = new Player("playerx",'X',true);
        } catch (IllegalTic illegalTic) {
            illegalTic.printStackTrace();
        }
    }
    Player playo;
    {
        try {
            playo = new Player("playero",'O',false);
        } catch (IllegalTic illegalTic) {
            illegalTic.printStackTrace();
        }
    }
    Board board = new Board();
    GamePlay game = new GamePlay(playx, playo, board);
    Button butpressed;

    @FXML
    private Button but20;
    @FXML
    private Label p1label;
    @FXML
    private Label text20;
    @FXML
    private Label text00;
    @FXML
    private Label text11;
    @FXML
    private Label text22;
    @FXML
    private Label text10;
    @FXML
    private Label text21;
    @FXML
    private Label text02;
    @FXML
    private Label text01;
    @FXML
    private Label text12;
    @FXML
    private Button but02;
    @FXML
    private Button but01;
    @FXML
    private Button but12;
    @FXML
    private Label p2label;
    @FXML
    private Button but00;
    @FXML
    private Button but11;
    @FXML
    private Button but22;
    @FXML
    private Button but10;
    @FXML
    private Button but21;

    @FXML
    void initialize() throws IllegalTic {
        p1label.setText(playx.getName());
        p2label.setText(playo.getName());
    }

    @FXML
    void press (ActionEvent event) {
        butpressed = (Button)event.getTarget();
        int row = Integer.parseInt(butpressed.getId().substring(3,4));
        int col= Integer.parseInt(butpressed.getId().substring(4,5));

        if(!board.isSpaceOccupied(row,col)) {
            char mark = game.getCurrentMarker();
            butpressed.setText(Character.toString(mark));
            board.updateBoard(row,col,mark);
            butpressed.setDisable(true);
        }
        if(board.checkForWinner()) {
            p1label.setText("WINNER!");
            p2label.setText("LOSER!");
        }
        game.swapPlayers();
        swapPlayerFocus();
    }

    void swapPlayerFocus(){
        if (playx.getTurn()) {
            p1label.setStyle("-fx-font-weight: bold");
            p2label.setStyle("-fx-font-weight: regular");
        } else {
            p1label.setStyle("-fx-font-weight: regular");
            p2label.setStyle("-fx-font-weight: bold");
        }
    }


    /* Individual button handlers
    @FXML
    void press20(ActionEvent event) {
        if(!board.isSpaceOccupied(2,0)) {
            char mark = game.getCurrentMarker();
            text20.setText(Character.toString(mark));
            board.updateBoard(2,0,mark);
            but20.setDisable(true);
        }
        if(board.checkForWinner()) {
            p1label.setText("WINNER!");
            p2label.setText("LOSER!");
        }
        game.swapPlayers();
    }

    @FXML
    void press10(ActionEvent event) {
        if(!board.isSpaceOccupied(1,0)) {
            char mark = game.getCurrentMarker();
            text10.setText(Character.toString(mark));
            board.updateBoard(1,0,mark);
            but10.setDisable(true);
        }
        if(board.checkForWinner()) {
            p1label.setText("WINNER!");
            p2label.setText("LOSER!");
        }
        game.swapPlayers();
    }

    @FXML
    void press00(ActionEvent event) {
        if(!board.isSpaceOccupied(0,0)) {
            char mark = game.getCurrentMarker();
            text00.setText(Character.toString(mark));
            board.updateBoard(0,0,mark);
            but00.setDisable(true);
        }
        if(board.checkForWinner()) {
            p1label.setText("WINNER!");
            p2label.setText("LOSER!");
        }
        game.swapPlayers();
    }

    @FXML
    void press01(ActionEvent event) {
        if(!board.isSpaceOccupied(0,1)) {
            char mark = game.getCurrentMarker();
            text01.setText(Character.toString(mark));
            board.updateBoard(0,1,mark);
            but01.setDisable(true);
        }
        if(board.checkForWinner()) {
            p1label.setText("WINNER!");
            p2label.setText("LOSER!");
        }
        game.swapPlayers();
    }

    @FXML
    void press02(ActionEvent event) {
        if(!board.isSpaceOccupied(0,2)) {
            char mark = game.getCurrentMarker();
            text02.setText(Character.toString(mark));
            board.updateBoard(0,2,mark);
            but02.setDisable(true);
        }
        if(board.checkForWinner()) {
            p1label.setText("WINNER!");
            p2label.setText("LOSER!");
        }
        game.swapPlayers();
    }

    @FXML
    void press11(ActionEvent event) {
        if(!board.isSpaceOccupied(1,1)) {
            char mark = game.getCurrentMarker();
            text11.setText(Character.toString(mark));
            board.updateBoard(1,1,mark);
            but11.setDisable(true);
        }
        if(board.checkForWinner()) {
            p1label.setText("WINNER!");
            p2label.setText("LOSER!");
        }
        game.swapPlayers();
    }

    @FXML
    void press21(ActionEvent event) {
        if(!board.isSpaceOccupied(2,1)) {
            char mark = game.getCurrentMarker();
            text21.setText(Character.toString(mark));
            board.updateBoard(2,1,mark);
            but21.setDisable(true);
        }
        if(board.checkForWinner()) {
            p1label.setText("WINNER!");
            p2label.setText("LOSER!");
        }
        game.swapPlayers();
    }

    @FXML
    void press12(ActionEvent event) {
        if(!board.isSpaceOccupied(1,2)) {
            char mark = game.getCurrentMarker();
            text12.setText(Character.toString(mark));
            board.updateBoard(1,2,mark);
            but12.setDisable(true);
        }
        if(board.checkForWinner()) {
            p1label.setText("WINNER!");
            p2label.setText("LOSER!");
        }
        game.swapPlayers();
    }

    @FXML
    void press22(ActionEvent event) {
        if(!board.isSpaceOccupied(2,2)) {
            char mark = game.getCurrentMarker();
            text22.setText(Character.toString(mark));
            board.updateBoard(2,2,mark);
            but22.setDisable(true);
        }
        if(board.checkForWinner()) {
            p1label.setText("WINNER!");
            p2label.setText("LOSER!");
        }
        game.swapPlayers();
    }

*/
}

