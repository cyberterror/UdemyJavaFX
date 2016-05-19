package com.cyberterror.datepicker.section5lection12.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextInputDialog;

import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.Optional;

/**
 * Created by CYBERTERROR on 19.05.2016.
 */
public class MainWindowController {

    private Main main;
    public void setMain(Main main) {
        this.main = main;

        // Установим текущую дату
//        datePicker.setValue(LocalDate.now());
        datePicker.setValue(LocalDate.of(2015,01,01));
        // Для изменения формата даты изменяем main метод в Main классе
        // Можем изменить даже хронолонию
        datePicker.setChronology(ThaiBuddhistChronology.INSTANCE);
    }

    @FXML
    private DatePicker datePicker;


    public void applyChanges(ActionEvent event) {
        LocalDate date = datePicker.getValue();
        System.out.println(date);
    }
}
