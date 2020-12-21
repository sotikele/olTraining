package com.oltraining.oltraining.mapper;

import com.oltraining.oltraining.dto.DeviceDTO;
import com.oltraining.oltraining.model.Device;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeviceMapper {

    Device deviceDTOToDevice(DeviceDTO deviceDTO);
    DeviceDTO deviceToDeviceDTO(Device device);
    List<Device> devicesDTOToDevices(List<DeviceDTO> deviceDTOList);
    List<DeviceDTO> devicesToDevicesDTO(List<Device> deviceList);
}
