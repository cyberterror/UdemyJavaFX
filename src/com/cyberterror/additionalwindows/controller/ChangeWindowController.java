package com.cyberterror.additionalwindows.controller;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

/**
 * Created by CYBERTERROR on 20.05.2016.
 */
public class ChangeWindowController {


    private Main main;
    private Stage changeWindowStage;

    public void setMain(Main main, Stage changeWindowStage) {
        this.main = main;
        this.changeWindowStage = changeWindowStage;
    }

    public void goBack(ActionEvent event) {
        System.out.println("Go back");
        main.mainWindow();
    }
}
