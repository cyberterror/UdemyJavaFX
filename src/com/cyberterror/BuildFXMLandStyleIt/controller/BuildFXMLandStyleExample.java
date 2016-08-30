package com.cyberterror.BuildFXMLandStyleIt.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BuildFXMLandStyleExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/BuildFXMLandStyleView.fxml"));

        GridPane gridPane = (GridPane) root;

        /**
         * Лучшая практика это добавить CSS как ресурс
         *
         * getClass() метод
         * каждый объект может вызывать этот метод (наследование от Object)
         * получить управление над классом который создал объект
         * (англ. get handle of the class that created your instance)
         * какой класс создал этот экземпляр
         *
         * getResource()
         * пробует найти не java файл со указанным именем
         * возвращает URL
         *
         * */

        root.getStylesheets().add(getClass().getResource("../css/sample.css").toExternalForm());


        primaryStage.setTitle("Build FXML example!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
