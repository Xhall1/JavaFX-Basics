package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class holaMundoController {

    @FXML
    private Label lblMensaje;

    @FXML
    void click(ActionEvent event) {
        System.out.println("Hello World!");
        lblMensaje.setText("Hello World in Label text :)");
    }

}
