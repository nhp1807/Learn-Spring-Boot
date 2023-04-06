package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee emp){
        return service.createEmployee(emp);
    }

    @GetMapping("/list")
    public List<Employee> getEmployeeList(){
        return service.getEmployeeList();
    }

    @GetMapping("/list/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public Employee updatEmployee(@RequestBody Employee emp, @PathVariable int id){
        return service.updateEmployee(emp, id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){
        service.deleteEmployee(id);
        return ResponseEntity.ok().body("Delete Successfully");
    }
}
