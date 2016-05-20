package com.cyberterror.additionalwindows.controller;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

/**
 * Created by CYBERTERROR on 20.05.2016.
 */
public class SecondWindowController {

    private Main main;
    private Stage secondWindowStage;

    public void setMain(Main main, Stage secondWindowStage) {
        this.main = main;
        this.secondWindowStage = secondWindowStage;

    }

    public void goBack(ActionEvent event) {
        System.out.println("Go back");
        secondWindowStage.close();

    }
}

