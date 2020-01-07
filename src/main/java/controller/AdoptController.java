package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import data.Animal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static data.FakeData.animals;

public class AdoptController {
    public static String ANIMAL_TYPE = "";
    @FXML
    private AnchorPane content;
    @FXML
    private JFXRadioButton rbAnjing;
    @FXML
    private JFXRadioButton rbKucing;
    @FXML
    private JFXRadioButton rbBurung;
    @FXML
    private JFXRadioButton rbHamster;
    @FXML
    private JFXRadioButton rbKelinci;
    @FXML
    private JFXRadioButton rbBiawak;
    @FXML
    private JFXRadioButton rbUlar;
    @FXML
    private JFXButton idNextBtn;

    public void handleRbAnimal(ActionEvent event){
        if (rbAnjing.isSelected()){
            ANIMAL_TYPE = animals.get(0).getType();
        }else if (rbKucing.isSelected()){
            ANIMAL_TYPE = animals.get(1).getType();
        }else if (rbBurung.isSelected()){
            ANIMAL_TYPE = animals.get(2).getType();
        }else if (rbHamster.isSelected()){
            ANIMAL_TYPE = animals.get(3).getType();
        }else if (rbKelinci.isSelected()){
            ANIMAL_TYPE = animals.get(4).getType();
        }else if (rbBiawak.isSelected()){
            ANIMAL_TYPE = animals.get(5).getType();
        }else if (rbUlar.isSelected()){
            ANIMAL_TYPE = animals.get(6).getType();
        }
    }

    @FXML
    void handleAdoptNextBtn(ActionEvent event) throws IOException {
        setView("../DataApp.fxml");
    }

    void setView(String view) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(view));
        content.getChildren().clear();
        content.getChildren().setAll(root);
    }
}
