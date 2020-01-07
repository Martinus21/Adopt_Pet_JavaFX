package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static controller.DataController.*;

public class ListController implements Initializable {
    @FXML
    private Text idDtAdoptName;
    @FXML
    private Text idDtJnsHewan;
    @FXML
    private Text idDtJnsKelamin;
    @FXML
    private Text idDtJumlahHewan;
    @FXML
    private JFXButton idCloseBtn;

    @FXML
    void handleClose(ActionEvent event) {
        Stage stage = (Stage) idCloseBtn.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idDtAdoptName.setText(dataAdoptName);
        idDtJnsHewan.setText(dataJenisHewan);
        idDtJumlahHewan.setText(dataJumlahHewan);
        idDtJnsKelamin.setText(dataJenisKelaminHewan);
    }
}
