package com.oltraining.oltraining.mapper;

import com.oltraining.oltraining.dto.EmployeeDTO;
import com.oltraining.oltraining.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper {

    Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO employeeToEmployeeDTO(Employee employee);
}
