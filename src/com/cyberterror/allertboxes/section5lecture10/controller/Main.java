package com.cyberterror.allertboxes.section5lecture10.controller;/**
 * Created by CYBERTERROR on 19.05.2016.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        mainWindow();
    }

    public void mainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../view/MainWindowView.fxml"));
            AnchorPane pane = loader.load();

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(this);

            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Section 5 lecture 10");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
