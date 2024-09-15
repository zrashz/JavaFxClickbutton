package com.example.hellowproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label clickMessageLabel;

    @FXML
    protected void handleButtonClick() {
        clickMessageLabel.setText("Button clicked!");
    }
}
