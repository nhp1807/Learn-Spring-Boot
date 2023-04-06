package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "emp_name")
    private String name;
    @Column
    private float salary;
    @Column
    private String email;

    public Employee(String name, float salary, String email){
        this.name = name;
        this.salary = salary;
        this.email = email;
    }
}
