package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        GridPane popup = (GridPane)FXMLLoader.load(getClass().getResource("Popup.fxml"));
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(popup, 600, 200));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
