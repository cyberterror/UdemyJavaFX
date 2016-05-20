package com.cyberterror.cssstyles.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;

import java.util.Optional;

/**
 * Created by CYBERTERROR on 19.05.2016.
 */
public class MainWindowController {

    @FXML public Region region;
    @FXML public Label titleLabel, lastNameLabel, emailLabel, firstNameLabel;
    @FXML public TextField firstNameField, lastNameField, emailField;
    @FXML public Button CancelButton, okButton;


    private Main main;
    public void setMain(Main main) {
        this.main = main;
    }

    public void handleCancel(ActionEvent event) {
        System.out.println("handleCancel");
    }

    public void handleOk(ActionEvent event) {
        System.out.println("handleOk");
    }
}
