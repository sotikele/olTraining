package com.oltraining.oltraining.service;

import com.oltraining.oltraining.dto.EmployeeDTO;
import com.oltraining.oltraining.mapper.EmployeeMapper;
import com.oltraining.oltraining.model.Employee;
import com.oltraining.oltraining.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeMapper employeeMapper;

    public List<EmployeeDTO> findAll()
    {
        List<Employee> employeeDTOList = employeeRepository.findAll();
        return employeeMapper.employeesToEmployeesDTO(employeeDTOList) ;
    }

    public EmployeeDTO findEmployee(String id){
        Optional<Employee> employee = employeeRepository.findById(Integer.parseInt(id));
        if(employee.isPresent()){
            return  employeeMapper.employeeToEmployeeDTO(employee.get());
        }
        return null;

    }

    public void save( EmployeeDTO employee){
         employeeRepository.save(employeeMapper.employeeDTOToEmployee(employee));
    }

    public void update( EmployeeDTO employeeDTO,String id){
        employeeRepository.deleteById(Integer.parseInt(id));
        employeeRepository.save(employeeMapper.employeeDTOToEmployee(employeeDTO));
    }

    public void delete( String id){
        employeeRepository.deleteById(Integer.parseInt(id));
    }
}
