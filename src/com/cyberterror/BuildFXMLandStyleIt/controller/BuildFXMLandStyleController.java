package com.cyberterror.BuildFXMLandStyleIt.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BuildFXMLandStyleController {

    @FXML private TextField firstNameTextField;

    public void handleSaySup(ActionEvent actionEvent) {
        System.out.printf("Sup! %s ! %n", firstNameTextField.getText());
    }
}
