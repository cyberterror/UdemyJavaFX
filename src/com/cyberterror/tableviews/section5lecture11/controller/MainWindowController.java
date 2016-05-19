package com.cyberterror.tableviews.section5lecture11.controller;

import com.cyberterror.tableviews.section5lecture11.model.Person;
import com.sun.org.apache.xpath.internal.operations.String;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


/**
 * Created by CYBERTERROR on 19.05.2016.
 */
public class MainWindowController {

    /**
     * Нам нужна ининциализация initialize(), чтобы таблица знала откуда брать информацию для колонок. Метод не требует
     * специального вызова, по типу конструктора.
     * Используя ссылки на колонки FXML мы вызываем метод setCellValueFactory для каждой колонки и в качестве параметра
     * передаем new PropertyValueFactory<Person, String>("НАЗВАНИЕ ПОЛЯ")*/
    public void initialize()
    {
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("age"));
    }

    /** В этот раз мы передадим контроллеру не только ссылку на Main класс но и на primaryStage чтобы можно было им манипулировать*/
    private Main main;
    private Stage primaryStage;
    public void setMain(Main main, Stage primaryStage) {
        this.main = main;
        this.primaryStage = primaryStage;

        // заполняем таблицу временными значениями и отражаем их в TableView но нужна инициализация колонок до этого действия
        setTableData();
        tableView.setItems(personList);
    }

    /** Привязываем кнопку, таблицу и колонки таблицы к соответсвующим переменным в классе контроллере*/

    @FXML
    private Button closeButton;

    @FXML
    private TableView<Person> tableView; // можно указать тип данных которым оперирует элемент в < >
    @FXML
    private TableColumn<Person, String> firstNameColumn;
    @FXML
    private TableColumn<Person, String> lastNameColumn;
    @FXML
    private TableColumn<Person, String> ageColumn;

    /** ObservableList это особый вид ArrayList
     * Создаем такой для списка объектов типа Person
     * Почему мы используем такой вид коллекции?
     * 1. Наблюдает за хранимой информацией*/
    private ObservableList<Person> personList = FXCollections.observableArrayList();


    /** Поведение на события для вида*/

    @FXML
    public void closeWindow()
    {
        primaryStage.close();
    }

    // метод, который заполнит таблицу временными объектами типа Person
    public void setTableData()
    {
        personList.add(new Person("Charlie", "Brown", "25"));
        personList.add(new Person("Joe", "Cocker", "70"));
        personList.add(new Person("Dr", "Frankenstein", "62"));
        personList.add(new Person("Abraham", "Lincoln", "104"));
        personList.add(new Person("Paul", "Auster", "56"));
        personList.add(new Person("Homer", "Simpson", "48"));
        personList.add(new Person("Jack", "Sparrow", "39"));
    }



}
