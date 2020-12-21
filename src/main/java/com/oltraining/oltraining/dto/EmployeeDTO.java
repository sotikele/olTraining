package com.oltraining.oltraining.dto;

import com.oltraining.oltraining.model.Company;
import com.oltraining.oltraining.model.Device;

import java.util.List;

public class EmployeeDTO {

    private Integer id;
    private String name;
    private String email;
    private Company company;
    private List<Device> devices;


    public EmployeeDTO(Integer id, String name, String email, Company company, List<Device> devices) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.company = company;
        this.devices = devices;
    }

    public EmployeeDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
