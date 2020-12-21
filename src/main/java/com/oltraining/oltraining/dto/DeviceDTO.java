package com.oltraining.oltraining.dto;

import com.oltraining.oltraining.model.Company;
import com.oltraining.oltraining.model.Employee;

public class DeviceDTO {

    private String serialNumber;
    private String name;
    private String type;
    private Company company;
    private Employee employee;

    public DeviceDTO() {
    }

    public DeviceDTO(String serialNumber, String name, String type, Company company, Employee employee) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.type = type;
        this.company = company;
        this.employee = employee;
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
