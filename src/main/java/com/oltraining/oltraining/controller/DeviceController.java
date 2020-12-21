package com.oltraining.oltraining.controller;

import com.oltraining.oltraining.dto.DeviceDTO;
import com.oltraining.oltraining.model.Device;
import com.oltraining.oltraining.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceController {

    private DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }


    @GetMapping("/devices")
    public List<DeviceDTO> getAll() {
        return deviceService.findAll();
    }

    @GetMapping("/devices/{id}")
    public DeviceDTO getDevice(@PathVariable String id) {
        return deviceService.findDevice(id);
    }

    @PostMapping("/devices")
    public void save(@RequestBody DeviceDTO deviceDTO) {
        deviceService.save(deviceDTO);
    }

    @PutMapping("/devices/{id}")
    public void update(@RequestBody DeviceDTO deviceDTO, @PathVariable String id) {
        deviceService.update(deviceDTO, id);
    }

    @DeleteMapping("/devices/{id}")
    public void delete(@PathVariable String id) {
        deviceService.delete(id);
    }
}