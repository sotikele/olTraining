package com.oltraining.oltraining.service;

import com.oltraining.oltraining.model.Device;
import com.oltraining.oltraining.model.Employee;
import com.oltraining.oltraining.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public List<Device> findAll() {
       return deviceRepository.findAll();
    }

    public Optional<Device> findDevice(String id) {
        return  deviceRepository.findById(id);
    }

    public void save(Device device) {
        deviceRepository.save(device);
    }

    public void update(Device device, String id) {
        deviceRepository.deleteById(id);
        deviceRepository.save(device);
    }

    public void delete(String id) {
        deviceRepository.deleteById(id);
    }
}
