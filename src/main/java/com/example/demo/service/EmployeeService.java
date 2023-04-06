package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public interface EmployeeService {
    public Employee createEmployee(Employee emp);
    public List<Employee> getEmployeeList();
    public Employee getEmployeeById(int id);
    public Employee updateEmployee(Employee emp, int id);
    public void deleteEmployee(int id);
}
