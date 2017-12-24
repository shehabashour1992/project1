package com.order.design5;


import java.io.Serializable;

public class DepartmentClass implements Serializable {
    private int number;
    private String name;
    private String destination;

    public DepartmentClass(int number, String name, String destination) {
        this.number = number;
        this.name = name;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
