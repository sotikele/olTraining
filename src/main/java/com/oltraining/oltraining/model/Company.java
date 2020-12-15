package com.oltraining.oltraining.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String address;
    @OneToMany
    @JoinColumn(name = "company_id")
    private List<Device> devices;
    @OneToMany
    @JoinColumn(name = "company_id")
    private List<Employee> employees;
    @JoinColumn(name = "company_id")
    @OneToMany
    private List<Admin> admins;

    public Company(String name, String address, List<Device> devices, List<Employee> employees, List<Admin> admins) {
        this.name = name;
        this.address = address;
        this.devices = devices;
        this.employees = employees;
        this.admins = admins;
    }

    public Company() {
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
