package com.mctc.toolsviewer.models;

public class Tool {
    private long id;
    private String name;
    private double attacSpeed;
    private double demage;
    public Tool(){}
    
    public Tool(long id, String name, double attacSpeed, double demage) {
        this.id = id;
        this.name = name;
        this.attacSpeed = attacSpeed;
        this.demage = demage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttacSpeed() {
        return attacSpeed;
    }

    public void setAttacSpeed(double attacSpeed) {
        this.attacSpeed = attacSpeed;
    }

    public double getDemage() {
        return demage;
    }

    public void setDemage(double demage) {
        this.demage = demage;
    }
}
