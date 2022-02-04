package com.example.springboot040220222.repository;

import com.example.springboot040220222.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}