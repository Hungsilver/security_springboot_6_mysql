package com.example.demosecuritydb.repository;

import com.example.demosecuritydb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Employee, String> {
}
