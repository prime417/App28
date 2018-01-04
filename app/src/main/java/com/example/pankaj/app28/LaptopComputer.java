package com.example.pankaj.app28;

import android.view.LayoutInflater;

import java.util.Locale;

/**
 * Created by Pankaj on 03-01-2018.
 */

public class LaptopComputer extends Computer {

    private String touchPad;
    private double cpuPower;
    private double ram;
    private String mouse;

    public LaptopComputer(String name,String keyboard, String screen, String mouse, String touchPad ,double cpuPower,double ram  ){

        super(name, keyboard, screen);

        this.touchPad = touchPad;
        this.cpuPower = cpuPower;
        this.ram = ram;
        this.mouse = mouse;
    }

    public String getTouchPad() {
        return touchPad;
    }

    public void setTouchPad(String touchPad) {
        this.touchPad = touchPad;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {
        this.cpuPower = cpuPower;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public double evaluatePerformance() {
        return getCpuPower() * getRam();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(Locale.ENGLISH,"%s: %s %n %s: %s %n %s: %f %n %s: %f ","TouchPad",getTouchPad(),"Mouse",getMouse(),"CPU Power",getCpuPower(),"RAM",getRam());
    }
}
