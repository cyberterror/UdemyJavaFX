package com.cyberterror.allertboxes.section5lecture10.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

/**
 * Created by CYBERTERROR on 19.05.2016.
 */
public class MainWindowController {

    private Main main;
    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    public void showAllert1()
    {
        System.out.println("showAllert1");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        /**
         * Так как тревога по сути является Stage элементом мы можем вызывать соответсвующие методы Stage*/
        alert.setTitle("Information for William Shakespeare"); // Заголовок окна тревоги
        alert.setHeaderText("William Shakespeare"); // Заголовок тревоги
        alert.setContentText("William Shakespeare (/ˈʃeɪkspɪər/;[1] 26 April 1564 (baptised) – 23 April 1616)[nb 1] was " +
                "an English poet, playwright, and actor, widely regarded as the greatest writer in the English language " +
                "and the world's pre-eminent dramatist.[2] He is often called England's national poet, and the " +
                "\"Bard of Avon\".[3][nb 2] His extant works, including collaborations, consist of approximately " +
                "38 plays,[nb 3] 154 sonnets, two long narrative poems, and a few other verses, some of uncertain " +
                "authorship. His plays have been translated into every major living language and are performed more " +
                "often than those of any other playwright.[4]"); // Текст тревоги
        alert.showAndWait();
    }

    @FXML
    public void showAllert2()
    {
        System.out.println("showAllert2");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Error");
        alert.setContentText("This is very fatal error!");
        alert.showAndWait();
    }

    @FXML
    public void showAllert3()
    {
        System.out.println("showAllert3");
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText("Warning");
        alert.setContentText("This is very important warning!");
        alert.showAndWait();
    }

    @FXML
    public void showAllert4()
    {
        System.out.println("showAllert4");
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Confirmation for action");
        alert.setContentText("Are you sure you want to do this?");
        Optional<ButtonType>result = alert.showAndWait(); //Сохраняем тип нажатой кнопки в переменной

        // Вводим условие и по нему выбираем дальнейшие действия
        if (result.get() == ButtonType.OK)
        {
            System.out.println("Пользователь нажал кнопку ОК");
        }
        else System.out.println("Пользователь отменил действие");
    }

    @FXML
    public void showAllert5()
    {
        System.out.println("showAllert5");
        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setTitle("Input");
        textInputDialog.setContentText("Please enter your age: ");
        Optional<String> result = textInputDialog.showAndWait();
        System.out.println(result.get()); // rresult.isPresent() - проверить есть ли результат

    }

    @FXML
    public void showAllert6()
    {
        System.out.println("showAllert6");
    }
}
