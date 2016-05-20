package com.cyberterror.additionalwindows.controller;

/**
 * Created by CYBERTERROR on 20.05.2016.
 */
public class MainWindowController {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    public void openNewWindow()
    {
        System.out.println("new window");
        main.secondWindow();
    }

    public void changeWindow()
    {
        System.out.println("change the window");
        main.changeWindow();
    }
}
