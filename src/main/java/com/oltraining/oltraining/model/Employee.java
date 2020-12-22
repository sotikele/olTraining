package com.oltraining.oltraining.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    @ManyToOne
    @JsonIgnore
    private Company company;
    @OneToMany
    @JoinColumn(name = "employee_id")
    private List<Device> devices;

    public Employee(String name, String email, Company company, List<Device> devices) {
        this.name = name;
        this.email = email;
        this.company = company;
        this.devices = devices;
    }

    public Employee() {
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
