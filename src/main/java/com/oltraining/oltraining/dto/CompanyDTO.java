package com.oltraining.oltraining.dto;

import com.oltraining.oltraining.model.Admin;
import com.oltraining.oltraining.model.Device;
import com.oltraining.oltraining.model.Employee;

import java.util.List;

public class CompanyDTO {

    private Integer id;
    private String name;
    private String address;
    private List<Device> devices;
    private List<Employee> employees;
    private List<Admin> admins;

    public CompanyDTO(Integer id, String name, String address, List<Device> devices, List<Employee> employees, List<Admin> admins) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.devices = devices;
        this.employees = employees;
        this.admins = admins;
    }

    public CompanyDTO() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }
}
