package com.oltraining.oltraining.service;

import com.oltraining.oltraining.dto.DeviceDTO;
import com.oltraining.oltraining.mapper.DeviceMapper;
import com.oltraining.oltraining.model.Device;
import com.oltraining.oltraining.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private DeviceMapper deviceMapper;

    public List<DeviceDTO> findAll() {
        List<Device> devices  = deviceRepository.findAll();
        return deviceMapper.devicesToDevicesDTO(devices);


    }

    public DeviceDTO findDevice(String id) {
        Optional<Device> device = deviceRepository.findById(id);
        if(device.isPresent()){
            return  deviceMapper.deviceToDeviceDTO(device.get());
        }
        return null;
    }

    public void save(DeviceDTO deviceDTO) {
        deviceRepository.save(deviceMapper.deviceDTOToDevice(deviceDTO));
    }

    public void update(DeviceDTO deviceDTO, String id) {
        deviceRepository.deleteById(id);
        deviceRepository.save(deviceMapper.deviceDTOToDevice(deviceDTO));
    }

    public void delete(String id) {
        deviceRepository.deleteById(id);
    }
}
