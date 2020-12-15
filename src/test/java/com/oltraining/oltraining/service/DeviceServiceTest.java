package com.oltraining.oltraining.service;

import com.oltraining.oltraining.model.Device;
import com.oltraining.oltraining.repository.DeviceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DeviceServiceTest {

    @InjectMocks
    private DeviceService deviceService;
    @Mock
    private DeviceRepository deviceRepository;
    @Mock
    private Optional<Device> device;
    @Mock
    private List<Device> devices;

    @Test
    public void findAllTest() {
        when(deviceRepository.findAll()).thenReturn(devices);
        List<Device> deviceList =   deviceService.findAll();
        assertNotNull(deviceList);

    }

    @Test
    public void findDeviceTest() {

    }
    @Test
    public void saveTest() {

    }
    @Test
    public void updateTest() {

    }

    @Test
    public void deleteTest() {

    }
}
