package com.example.demo17;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ReadyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ready_menu;

    @FXML
    void initialize() {
        assert ready_menu != null : "fx:id=\"ready_menu\" was not injected: check your FXML file 'ready.fxml'.";

    }

}
