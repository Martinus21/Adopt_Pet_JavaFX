package controller;

import com.jfoenix.controls.*;
import data.Animal;
import data.AnimalRace;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static controller.AdoptController.ANIMAL_TYPE;
import static data.FakeData.animalRaces;
import static data.FakeData.animals;

public class DataController implements Initializable {
    @FXML
    private AnchorPane content;

    // DATA DIRI
    @FXML
    private JFXTextField idFieldDtDiriName;
    @FXML
    private JFXRadioButton rbDtDiriLakiLaki;
    @FXML
    private JFXRadioButton rbDtDiriPerempuan;
    @FXML
    private JFXComboBox<String> cBoxDtDiriUsia;
    @FXML
    private ToggleGroup DataDiriGender;

    // DATA HEWAN
    @FXML
    private JFXTextField idDtJumlahHewan;
    @FXML
    private JFXRadioButton rbDtHewanBetina;
    @FXML
    private JFXRadioButton rbDtHewanJantan;
    @FXML
    private ToggleGroup DataHewanGender;
    @FXML
    private JFXComboBox<String> cBoxDtJenisHewan;
    @FXML
    private JFXComboBox<String> cBoxDtUmurHewan;

    @FXML
    private JFXToggleButton toggleBtn;

    @FXML
    private JFXButton idBtnDataDone;

    public static String dataAdoptName = "";
    public static String dataJenisHewan = "";
    public static String dataJumlahHewan = "";
    public static String dataJenisKelaminHewan = "";

    // Data Usia User
    ObservableList<String> listDtDiriUsia = FXCollections.observableArrayList("20", "21", "22", "23", "24",
            "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40");

    // Umur Hewan
    ObservableList<String> listDtUmurHewan = FXCollections.observableArrayList("8 bln", "1 thn", "2 thn", "3 thn");

    ObservableList<String> jenisHewan = FXCollections.observableArrayList();

    @FXML
    void handleDataDone(ActionEvent event) throws IOException {
        dataAdoptName = idFieldDtDiriName.getText();
        dataJumlahHewan = idDtJumlahHewan.getText();
        dataJenisHewan = cBoxDtJenisHewan.getValue();
        setView("../ListApp.fxml");
    }

    @FXML
    void handleRBJnsKelaminHewan(ActionEvent event) {
        if (rbDtHewanJantan.isSelected()){
            dataJenisKelaminHewan = rbDtHewanJantan.getText();
        }else if (rbDtHewanBetina.isSelected()){
            dataJenisKelaminHewan = rbDtHewanBetina.getText();
        }
    }

    void setView(String view) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(view));
        content.getChildren().clear();
        content.getChildren().setAll(root);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idBtnDataDone.setDisable(true);
        toggleBtn.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleBtn.isSelected()){
                    toggleBtn.setText("Setuju");
                    idBtnDataDone.setDisable(false);
                }else if (!toggleBtn.isSelected()){
                    toggleBtn.setText("Tidak Setuju");
                    idBtnDataDone.setDisable(true);
                }
            }
        });

        cBoxDtDiriUsia.setItems(listDtDiriUsia);
        cBoxDtUmurHewan.setItems(listDtUmurHewan);

        for (Animal animal : animals) {
            if (ANIMAL_TYPE.equals(animal.getType())) {
                for (AnimalRace race : animalRaces) {
                    if (race.getType().getType().equals(ANIMAL_TYPE)) {
                        jenisHewan.add(race.getRace());
                    }
                }
                cBoxDtJenisHewan.setItems(jenisHewan);
                break;
            }
        }
    }

}
