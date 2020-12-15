package com.oltraining.oltraining.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Device {

    @Id
    @GeneratedValue
    private String serialNumber;
    private String name;
    private String type;
    @ManyToOne
    @JsonIgnore
    private Company company;
    @ManyToOne
    @JsonIgnore
    private Employee employee;

    public Device(String name, String type, Company company, Employee employee) {
        this.name = name;
        this.type = type;
        this.company = company;
        this.employee = employee;
    }

    public Device() {
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
