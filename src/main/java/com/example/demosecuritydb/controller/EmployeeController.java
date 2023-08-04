package com.example.demosecuritydb.controller;

import com.example.demosecuritydb.entity.Employee;
import com.example.demosecuritydb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeRepository emRepo;

    @GetMapping("/employees")
    private ResponseEntity<List<Employee>> getAll() {
        List<Employee> list = emRepo.findAll();
        return ResponseEntity.ok(list);
    }

}
