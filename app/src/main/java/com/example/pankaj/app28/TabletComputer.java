package com.example.pankaj.app28;

import java.util.Locale;

/**
 * Created by Pankaj on 03-01-2018.
 */

public class TabletComputer extends SmartphoneComputer{

    private int screenSize;

    public TabletComputer(String name, String keyboard,String screen,String operatingSystem,double cpuPower, double ram ,int screenSize){

        super(name,keyboard,screen,operatingSystem,cpuPower,ram);

        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public double evaluatePerformance() {
        return super.evaluatePerformance();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(Locale.ENGLISH,"%s: %d","Screen Size", getScreenSize());
    }
}
