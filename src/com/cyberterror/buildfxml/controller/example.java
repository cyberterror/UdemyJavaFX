package com.cyberterror.buildfxml.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class example extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/exampleView.fxml"));
        GridPane gridPane = (GridPane) root;

        primaryStage.setTitle("Build FXML example!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
