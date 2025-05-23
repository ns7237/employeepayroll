package com.bridgelabz.employeepayrollapp.dto;


public class EmployeePayrollDTO {
    private String name;
    private double salary;

    // Constructors
    public EmployeePayrollDTO() {}

    public EmployeePayrollDTO(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
