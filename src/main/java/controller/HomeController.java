package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    private AnchorPane content;
    @FXML
    private JFXButton adoptBtn;
    @FXML
    private JFXButton laterBtn;

    @FXML
    void handleAdopt(ActionEvent event) throws IOException {
        setView("../AdoptApp.fxml");
    }

    @FXML
    void handleLater(ActionEvent event) {
        Stage stage = (Stage) laterBtn.getScene().getWindow();
        stage.close();
    }

    void setView(String view) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(view));
        content.getChildren().clear();
        content.getChildren().setAll(root);
    }
}