package com.example.newairmap.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public Button button_go;
    public TextField textfield_start;
    public TextField textfield_destination;
    public Map canvas_map;

    @FXML
    protected void pressButton_go() {
        System.out.println("Start: " + textfield_start.getText());
        System.out.println("Destination: " + textfield_destination.getText());
    }


}