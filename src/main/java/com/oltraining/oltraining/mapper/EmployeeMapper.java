package com.oltraining.oltraining.mapper;

import com.oltraining.oltraining.dto.EmployeeDTO;
import com.oltraining.oltraining.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper {

    Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO employeeToEmployeeDTO(Employee employee);
    List<Employee> employeesDTOToEmployees(List<EmployeeDTO> employeeDTOList);
    List<EmployeeDTO> employeesToEmployeesDTO(List<Employee> employeeList);
}
