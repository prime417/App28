package com.example.pankaj.app28;

import java.util.Locale;

/**
 * Created by Pankaj on 03-01-2018.
 */

public class DesktopComputer extends Computer {

    private String mouse;
    private double cpuPower;
    private double ram;

    public DesktopComputer(String name,String keyboard, String screen, String mouse, double cpuPower, double ram){

        super(name, keyboard, screen);
        this.mouse = mouse;
        this.cpuPower = cpuPower;
        this.ram = ram;

    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
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

    @Override
    public double evaluatePerformance() {
        return getCpuPower() * getRam();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(Locale.ENGLISH,"%s: %s %n %s: %f %n %s: %f", "Mouse",getMouse(),"CPU Power",getCpuPower(),"RAM",getRam());
    }
}
