package com.infinite.SpringbootRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.SpringbootRest.model.Employee;
import com.infinite.SpringbootRest.repository.IEmployee;

@Service
public class EmployeeService {
	@Autowired
	IEmployee empReposit;

	// creating function of employee
	public Employee createEmployee(Employee emp) {
		return empReposit.save(emp);
	}

	// listing function for the employees
	public List<Employee> getEmployees() {
		return empReposit.findAll();
	}
}