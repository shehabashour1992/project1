package com.order.design5;

import java.io.Serializable;

public class EmployeesClass implements Serializable{
    private int id;
    private String name;
    private String address;
    private Double salary;
    private String job;

    public EmployeesClass() {
    }

    public EmployeesClass(int id, String name, String address, Double salary, String job) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
