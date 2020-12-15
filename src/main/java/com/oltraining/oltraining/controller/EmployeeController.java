package com.oltraining.oltraining.controller;

import com.oltraining.oltraining.model.Employee;
import com.oltraining.oltraining.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAll(){
      return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable String id){
        return employeeService.findEmployee(id);
    }

    @PostMapping("/employees")
    public void save(@RequestBody Employee employee){
         employeeService.save(employee);
    }

    @PutMapping("/employees/{id}")
    public void update(@RequestBody Employee employee,@PathVariable String id){
        employeeService.update(employee,id);
    }
    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable String id){
        employeeService.delete(id);
    }
}
