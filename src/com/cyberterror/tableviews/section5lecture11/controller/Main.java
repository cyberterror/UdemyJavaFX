package com.cyberterror.tableviews.section5lecture11.controller;/**
 * Created by CYBERTERROR on 19.05.2016.
 */

import com.cyberterror.tableviews.section5lecture11.model.Person;
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
            System.out.println();

            MainWindowController mainWindowController = loader.getController();
            // тут тоже небольшая правка, передаем primaryStage в параметрах setMain чтобы можно было обращаться к
            // нему из контроллера
            mainWindowController.setMain(this, primaryStage);

            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Section 5 lecture 10");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
