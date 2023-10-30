package com.infinite.SpringbootRest.controller;
import com.infinite.SpringbootRest.model.Employee;
import com.infinite.SpringbootRest.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	EmployeeService EmployeeService;
	//request mapping for employees
	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	//creation of employee
	public Employee createEmployee(@RequestBody Employee emp) {
		//System.out.println("created");
		return EmployeeService.createEmployee(emp);

	}
	
	@RequestMapping(value = "/reademployees", method = RequestMethod.GET)
	//listing the employees
	public List<Employee> showEmployees() {
		return EmployeeService.getEmployees();
	}
}
