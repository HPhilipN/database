package com.database.database.models;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class Users {
    private String name;
    private String password;
    private int height;
    private int weight;
    private String haircolor;
    private int gpa;
    
    public Users(){

    }

    public Users(String name, String password, int height, int weight, String haircolor, int gpa) {
        this.name = name;
        this.password = password;
        this.height = height;  
        this.weight = weight;
        this.haircolor = haircolor;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }


}
