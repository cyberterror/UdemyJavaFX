package com.cyberterror.tableviews.section5lecture11.model;

/**
 * Created by CYBERTERROR on 19.05.2016.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String age; // Используем String так как не собираемся проводить какие то рассчеты связанные с возрастом

    public Person(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // геттеры
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getAge() {return age;}

    // сеттеры
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(String age) {this.age = age;}
}
