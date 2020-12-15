package com.oltraining.oltraining.mapper;

import com.oltraining.oltraining.dto.DeviceDTO;
import com.oltraining.oltraining.model.Device;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeviceMapper {

    Device deviceDTOToDevice(DeviceDTO deviceDTO);
    DeviceDTO deviceToDeviceDTO(Device device);
}
