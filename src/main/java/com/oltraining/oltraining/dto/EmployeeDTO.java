package com.oltraining.oltraining.dto;

import com.oltraining.oltraining.model.Company;
import com.oltraining.oltraining.model.Device;

import java.util.List;

public class EmployeeDTO {

    private Integer id;
    private String name;
    private String email;
    private String companyId;
    private List<Device> devices;


    public EmployeeDTO(Integer id, String name, String email, String company, List<Device> devices) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.companyId = company;
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
