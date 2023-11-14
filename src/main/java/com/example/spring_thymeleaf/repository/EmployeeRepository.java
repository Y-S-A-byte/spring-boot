package com.example.spring_thymeleaf.repository;

import com.example.spring_thymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
