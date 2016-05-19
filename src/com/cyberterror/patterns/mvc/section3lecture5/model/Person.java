package com.cyberterror.patterns.mvc.section3lecture5.model;

/**
 * Created by CYBERTERROR on 19.05.2016.
 *
 * Это последняя составляющая для структуры паттерна MVC
 *
 * Для чего нам нужна модель когда вроде и так все работает:
 * 1. Модель позволяет внедрить данные в нашу программу
 *
 * Алгоритм создания:
 * 1. Определяем данные которые хранит модель
 * 2. Определяем конструктор для удобства создания
 * 3. Определяем способ получения данных другими классами через геттеры и сеттеры
 */
public class Person {

    /**
     * Определяем какие данные хранит класс
     */
    private String firstName;
    private String lastName;
    private String age; // Используем String так как не собираемся проводить какие то рассчеты связанные с возрастом

    /**
     * Определяем конструктор для класса */
    public Person(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {}

    /**
     * Определяем сеттеры и геттеры для данных, которые хранит класс
     */

    // геттеры
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getAge() {return age;}

    // сеттеры
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(String age) {this.age = age;}
}
