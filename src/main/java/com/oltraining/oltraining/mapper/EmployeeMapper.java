package com.oltraining.oltraining.mapper;

import com.oltraining.oltraining.dto.EmployeeDTO;
import com.oltraining.oltraining.model.Company;
import com.oltraining.oltraining.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper {

    Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);

    @Mapping(target = "companyId", source = "company", qualifiedByName = "mapCompany")
    EmployeeDTO employeeToEmployeeDTO(Employee employee);

    @Named("mapCompany")
    default Integer mapCompany(Company company) {
        if (company == null) {
            return null;
        }
        return company.getId();
    }

    List<Employee> employeesDTOToEmployees(List<EmployeeDTO> employeeDTOList);
    List<EmployeeDTO> employeesToEmployeesDTO(List<Employee> employeeList);
}
