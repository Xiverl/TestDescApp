package com.xiverl.testdescapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private TextField inputFieldA;
    @FXML
    private TextField inputFieldB;
    @FXML
    private TextArea resultArea;


    @FXML
    protected void onHelloButtonClick() {
        double a = Double.parseDouble(inputFieldA.getText());
        double b = Double.parseDouble(inputFieldB.getText());
        double result = a + b;
        resultArea.setText(String.format("Результат равен %.2f", result));
    }
}