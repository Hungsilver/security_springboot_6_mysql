package com.example.demosecuritydb;

import com.example.demosecuritydb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@Transactional
public class DemoSecurityDbApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoSecurityDbApplication.class, args);
    }

    @Autowired
    EmployeeRepository emRepo;

    @Override
    public void run(String... args) throws Exception {
//
//        Employee em = emRepo.findById("duc").get();
//       em.getRoles().forEach(System.out::println);
    }
}
