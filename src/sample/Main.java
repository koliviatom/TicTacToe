package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Platform.setImplicitExit(false);

        Stage pickPlayers = new Stage();
        GridPane popup = (GridPane)FXMLLoader.load(getClass().getResource("Popup.fxml"));
        pickPlayers.setTitle("Tic Tac Toe");
        pickPlayers.setScene(new Scene(popup, 600, 200));

        GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("gameView.fxml"));
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(root, 500, 500));

        pickPlayers.setOnHidden(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {

                primaryStage.show();
            }
        });
        pickPlayers.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
