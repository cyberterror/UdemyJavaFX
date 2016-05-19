package com.cyberterror.patterns.mvc.section3lecture5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Created by CYBERTERROR on 18.05.2016.
 * Алгоритм создания:
 * 1. Определяем ссылку на Main класс и метод чтобы организовать на него ссылку
 * 2. Определяем ссылки на нужные элементы вида и методы для событий
 */
public class MainWindowController {

    /** В первую очередь делаем соединение с Основным классом
     * Позволяет нам вызывать любые методы основного класса вне контроллера*/
    private Main main;
    public void setMain(Main main) {this.main = main;}

    /** Соединение с элементами вида, то есть эти элементы находятся в FXML виде. Соответсвенно можем обращаться к ним*/
    @FXML private Label label;
    @FXML private TextField textField;

    @FXML
    public void handleButton(ActionEvent event){
        String text = textField.getText();
        label.setText(text);
        textField.clear();
    }
}
