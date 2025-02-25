package com.finac.sports.tennis.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class UserService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Collection<Employee> getAllEmployees() {
        return (Collection<Employee>) employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return (Employee) employeeRepository.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Integer id, Employee employee) {
        Employee existingEmployee = (Employee) employeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setID(employee.getID());
            existingEmployee.setEmployeeId(employee.getEmployeeId());
            existingEmployee.setFirstName(employee.getFirstName());
            existingEmployee.setLastName(employee.getLastName());
            existingEmployee.setAge(employee.getAge());
            return employeeRepository.save(existingEmployee);
        } else {
            return null;
        }
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
