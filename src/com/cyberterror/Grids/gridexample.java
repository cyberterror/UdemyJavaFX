package com.cyberterror.Grids;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class gridexample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        /** Основная нода, передается в параметр new Scene */
        Group root = new Group();
        VBox vBox = new VBox();
        vBox.setSpacing(10);

        Text text = new Text("Sup?");
        text.setFont(new Font("Droid Serif", 40));

        /** Grid example here ... */
        Label label = new Label("Name: ");
        TextField textField = new TextField();
        Button button = new Button("Click me!");
        GridPane gridPane = new GridPane();
        gridPane.add(label, 0, 0); // <- параметры, элемент, индекс колонки, индекс строки
        gridPane.add(textField, 1, 0);
        gridPane.add(button, 1, 1);

        gridPane.setHgap(10); // <- добавляем пространство между ячейками по горизонтали
        gridPane.setVgap(10); // <- добавляем пространство между ячейками по вертикали

        gridPane.setGridLinesVisible(false); // <- дебагинг

        /** Добавляем ноды в основную ноду */
        vBox.getChildren().addAll(text, gridPane);
        root.getChildren().addAll(vBox);

        /** Добавляем действие кнопке */
        button.setOnAction(event -> System.out.printf("Sup %s !", textField.getText()));

        /** Настраиваем и показываем Stage */
        primaryStage.setTitle("Grid example");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
