package com.oltraining.oltraining.dto;

public class DeviceDTO {

    private String serialNumber;
    private String name;
    private String type;
    private String companyId;
    private String employeeId;

    public DeviceDTO() {
    }

    public DeviceDTO(String serialNumber, String name, String type, String companyId, String employeeId) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.type = type;
        this.companyId = companyId;
        this.employeeId = employeeId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

}
