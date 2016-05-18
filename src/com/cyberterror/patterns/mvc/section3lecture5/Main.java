package com.cyberterror.patterns.mvc.section3lecture5;
/**
 * Created by CYBERTERROR on 18.05.2016.
 *
 * Тут присутсвует 2 метода start и main.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    /**
     * Для того чтобы иметь возможность использовать primaryStage в других частях программы мы присвом primaryStage
     * из метода start переменной экземпляра типа Stage
     */
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }


    /** Отвечает за запуск первого Stage нашей программы
     * Stage - ground level of application. На нем размещаеются другие элементы
     * */
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        // инициализируем наше основное окно
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
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml"));
            // используем AnchorPane (потому что это root элемент нашего FXML) для загрузки на него информации из FXML
            AnchorPane pane = loader.load();

            //подгружаем при помощи loader'а контроллер для основного окна
            // ВОТ ОНО СОЕДИЕНЕНИЕ MAIN CLASS - CONTROLLER!!!
            MainWindowController mainWindowController = loader.getController();

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
}
