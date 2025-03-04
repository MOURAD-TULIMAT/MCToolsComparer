package com.mctc.toolsviewer.models;

import java.util.UUID;

public class Armor {
    private UUID id;
    private String name;
    private double armor;
    private double durability;
    public Armor(){}
    
    public Armor(UUID id, String name, double attacSpeed, double demage) {
        this.id = id;
        this.name = name;
        this.armor = attacSpeed;
        this.durability = demage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double attacSpeed) {
        this.armor = attacSpeed;
    }

    public double getDurability() {
        return durability;
    }

    public void setDurability(double demage) {
        this.durability = demage;
    }
}
