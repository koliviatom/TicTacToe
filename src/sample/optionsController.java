package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class optionsController {


    public void changeToMain(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("gameView.fxml"));
        Scene mainScene = new Scene(mainParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(mainScene);
        window.show();
    }

}
