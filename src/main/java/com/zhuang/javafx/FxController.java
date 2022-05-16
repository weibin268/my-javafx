package com.zhuang.javafx;

import com.zhuang.javafx.utils.AlertUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class FxController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        AlertUtils.info("test");
        welcomeText.setText("Welcome to JavaFX Application!");

    }
}