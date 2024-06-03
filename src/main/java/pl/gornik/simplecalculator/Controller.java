package pl.gornik.simplecalculator;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnComma;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnEquals;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMultip;

    @FXML
    private Button btnPlus;

    @FXML
    private Button exit;

    @FXML
    private TextField prompt;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        exit.setOnAction(actionEvent -> Platform.exit());


    }
}
