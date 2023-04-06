package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.EmployeeRepository;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repo;

    @Override
    public Employee createEmployee(Employee emp) {
        return repo.save(emp);
    }

    @Override
    public List<Employee> getEmployeeList() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(Employee emp, int id) {
        Employee oldEmployee = repo.findById(id).orElse(null);
        oldEmployee.setId(emp.getId());
        oldEmployee.setName(emp.getName());
        oldEmployee.setSalary(emp.getSalary());
        oldEmployee.setEmail(emp.getEmail());
        repo.save(oldEmployee);

        return oldEmployee;
    }

    @Override
    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }
    
}
