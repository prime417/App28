package com.example.pankaj.app28;

import java.util.Locale;

/**
 * Created by Pankaj on 03-01-2018.
 */

public class SmartphoneComputer extends Computer {

    private String operatingSystem;
    private double cpuPower;
    private double ram;

    public SmartphoneComputer(String name,String keyboard, String screen, String operatingSystem,double cpuPower, double ram){

        super(name, keyboard, screen);

        this.operatingSystem = operatingSystem;
        this.cpuPower = cpuPower;
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
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
        return super.toString() + String.format(Locale.ENGLISH,"%s: %s %n %s: %f %n %s: %f ","OS",getOperatingSystem(),"CPU Power",getCpuPower(),"RAM",getRam());
    }
}
