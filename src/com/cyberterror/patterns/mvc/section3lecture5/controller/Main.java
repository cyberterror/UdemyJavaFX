package com.cyberterror.patterns.mvc.section3lecture5.controller;
/**
 * Created by CYBERTERROR on 18.05.2016.
 *
 * Тут присутсвует 2 метода start и main, а так же ссыока на primaryStage.
 *
 * Алгоритм создания:
 * 1. Формируем ссылку на primaryStage как переменную экземпляра через метод start
 * 2. В методе start запускаем метод, который инициализирует главное окно
 * 3. В методе главного окна подгружаем FXML при помощи FXMLLoader
 * 4. В методе главного окна подгружаем данные о контроллере в ссылку при помощи FXMLLoader
 * 5. В методе главного окна передаем ссылку на main контроллеру через специальный метод контроллера
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    /**
     * Для того чтобы иметь возможность обращаться к primaryStage из любого места в любой другой части программы мы
     * присвом primaryStage из метода start переменной экземпляра типа Stage
     */
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        // Затем инициализируем наше основное окно
        mainWindow();
    }

    /**
     * Следующий метод будет инициализировать основное окно и все его элементы.
     * Такой подход позволяет добиться большей структурированности нашего кода.
     * Можем вызывать этот метод тогда когда хотим.*/
    public void mainWindow()
    {
        /**
         * Подгружаем наш макет MainWindowView.fxml на компоновщик типа AnchorPane, окружаем блоком try/catch так как
         * могут быть проблемы при загрузке файла*/
        try {
            //создаем экземпляр загрузчика FXML и указываем имя файла с которым будем работать
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../view/MainWindowView.fxml"));
            // используем AnchorPane (потому что это root элемент нашего FXML) для загрузки на него информации из FXML
            AnchorPane pane = loader.load();

            /**
             * Для того чтобы иметь возможность обращаться к контроллеру (основного окна) подгружаем данные о нем в ссылку используя
             * используя loader который берет эти данные из FXML, после этого можно обратиться к любому методу напрямую.
             * Это мы используем в следующей строчке чтобы создать ссылку на main в контроллере
             *
             * */
            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(this);

            // загружаем наш pane в новый scene
            Scene scene = new Scene(pane);
            // подгружаем scene в primaryStage
            primaryStage.setScene(scene);
            primaryStage.setTitle("Section 3 lecture 5");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
