package com.oltraining.oltraining.controller;

import com.oltraining.oltraining.dto.EmployeeDTO;
import com.oltraining.oltraining.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<EmployeeDTO> getAll(){
      return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public EmployeeDTO getEmployee(@PathVariable String id){
        return employeeService.findEmployee(id);
    }

    @PostMapping("/employees")
    public void save(@RequestBody EmployeeDTO employeeDTO){
         employeeService.save(employeeDTO);
    }

    @PutMapping("/employees/{id}")
    public void update(@RequestBody EmployeeDTO employeeDTO,@PathVariable String id){
        employeeService.update(employeeDTO,id);
    }
    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable String id){
        employeeService.delete(id);
    }
}
