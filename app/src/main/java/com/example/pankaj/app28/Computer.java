package com.example.pankaj.app28;

import java.util.Locale;

/**
 * Created by Pankaj on 03-01-2018.
 */

public abstract class Computer {

    private final String NAME;
    private final String KEYBOARD;
    private final String SCREEN;

    public Computer(String name, String keyboard, String screen){

        this.NAME = name;
        this.KEYBOARD = keyboard;
        this.SCREEN = screen;

    }

    public String getNAME() {
        return NAME;
    }

    public String getKEYBOARD() {
        return KEYBOARD;
    }

    public String getSCREEN() {
        return SCREEN;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,"%s: %s %n %s: %s %n %s: %s", "Name",getNAME(),"Keyboard",getKEYBOARD(),"Screen",getSCREEN());
    }

    public abstract double evaluatePerformance();
}
