package com.oltraining.oltraining.service;

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

    public List<Employee> findAll(){
        return  employeeRepository.findAll();
    }

    public Optional<Employee> findEmployee(String id){
       return employeeRepository.findById(Integer.parseInt(id));
    }

    public void save( Employee employee){
         employeeRepository.save(employee);
    }

    public void update( Employee employee,String id){
        employeeRepository.deleteById(Integer.parseInt(id));
        employeeRepository.save(employee);
    }

    public void delete( String id){
        employeeRepository.deleteById(Integer.parseInt(id));
    }
}
