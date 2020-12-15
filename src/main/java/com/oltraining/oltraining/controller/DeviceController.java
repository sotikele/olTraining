package com.oltraining.oltraining.controller;

import com.oltraining.oltraining.model.Device;
import com.oltraining.oltraining.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DeviceController {

    private DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }


    @GetMapping("/devices")
    public List<Device> getAll() {
        return deviceService.findAll();
    }

    @GetMapping("/devices/{id}")
    public Optional<Device> getDevice(@PathVariable String id) {
        return deviceService.findDevice(id);
    }

    @PostMapping("/devices")
    public void save(@RequestBody Device device) {
        deviceService.save(device);
    }

    @PutMapping("/devices/{id}")
    public void update(@RequestBody Device device, @PathVariable String id) {
        deviceService.update(device, id);
    }

    @DeleteMapping("/devices/{id}")
    public void delete(@PathVariable String id) {
        deviceService.delete(id);
    }
}