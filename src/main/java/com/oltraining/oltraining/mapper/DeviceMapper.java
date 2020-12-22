package com.oltraining.oltraining.mapper;

import com.oltraining.oltraining.dto.DeviceDTO;
import com.oltraining.oltraining.model.Company;
import com.oltraining.oltraining.model.Device;
import com.oltraining.oltraining.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeviceMapper {

    Device deviceDTOToDevice(DeviceDTO deviceDTO);
    @Mapping(target = "companyId", source = "company", qualifiedByName = "mapCompany")
    @Mapping(target = "employeeId", source = "employee", qualifiedByName = "mapEmployee")
    DeviceDTO deviceToDeviceDTO(Device device);

    @Named("mapCompany")
    default Integer mapCompany(Company company) {
        if (company == null) {
            return null;
        }
        return company.getId();
    }

    @Named("mapEmployee")
    default Integer mapCompany(Employee employee) {
        if (employee == null) {
            return null;
        }
        return employee.getId();
    }


    List<Device> devicesDTOToDevices(List<DeviceDTO> deviceDTOList);
    List<DeviceDTO> devicesToDevicesDTO(List<Device> deviceList);
}
