package com.cscode.gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class CscodeApplicationController implements Initializable {

    @FXML
    private ComboBox<String> comboBarcodeType;
    @FXML
    private ComboBox<String> comboImageType;
    @FXML
    private ComboBox<String> comboColumnData;
    @FXML
    private ComboBox<String> comboColumnName;

    @FXML
    private TextField fieldWith;
    @FXML
    private TextField fieldHeight;
    @FXML
    private TextField fieldCsvFile;
    @FXML
    private TextField fieldOutputDir;

    @FXML
    private CheckBox checkDisplayValue;

    @FXML
    private Button buttonCsvFile;
    @FXML
    private Button buttonOutputDir;
    @FXML
    private Button buttonGenerate;

    @FXML
    private ProgressBar progressBar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
