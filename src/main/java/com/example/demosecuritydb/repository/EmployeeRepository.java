package com.example.demosecuritydb.repository;

import com.example.demosecuritydb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
