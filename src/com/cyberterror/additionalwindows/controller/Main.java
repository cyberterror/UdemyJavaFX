package com.cyberterror.additionalwindows.controller;/**
 * Created by CYBERTERROR on 20.05.2016.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private Stage secondWindowStage;

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
            primaryStage.setTitle("Section 6 lecture 13");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void secondWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../view/SecondWindowView.fxml"));
            AnchorPane pane = loader.load();

            SecondWindowController secondWindowController = loader.getController();
            Stage secondWindowStage = new Stage();
            secondWindowController.setMain(this, secondWindowStage);

            Scene scene = new Scene(pane);


            /** Чтобы не создавать кучу окон. В этом режиме мы не можем обращаться к основному окну пока не закроем новое*/
//            secondWindowStage.initModality(Modality.APPLICATION_MODAL);
            /** Другой режим предпологаем что мы укажем владельца, принцип тот же*/
            secondWindowStage.initOwner(primaryStage);
            secondWindowStage.initModality(Modality.WINDOW_MODAL);


            secondWindowStage.setScene(scene);
            secondWindowStage.setTitle("Section 6 lecture 13 - Second Window");
            secondWindowStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../view/ChangeWindowView.fxml"));
            AnchorPane pane = loader.load();

            ChangeWindowController changeWindowController = loader.getController();
            changeWindowController.setMain(this, primaryStage);

            Scene scene = new Scene(pane);


            /** Чтобы не создавать кучу окон. В этом режиме мы не можем обращаться к основному окну пока не закроем новое*/
//            secondWindowStage.initModality(Modality.APPLICATION_MODAL);
            /** Другой режим предпологаем что мы укажем владельца, принцип тот же*/

            primaryStage.setScene(scene);
            primaryStage.setTitle("Section 6 lecture 13 - Change Window");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
