package com.example.springboot040220222.service;

import com.example.springboot040220222.entity.Employee;
import com.example.springboot040220222.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee getEmployee(Long id){
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("ID " + id + " nicht gefunden"));
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}