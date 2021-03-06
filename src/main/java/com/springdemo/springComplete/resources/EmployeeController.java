package com.springdemo.springComplete.resources;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springdemo.springComplete.entity.Employee;
import com.springdemo.springComplete.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getEmployees(){
		return employeeService.getEmploees();
	}
	
	@GetMapping("/{id}")
	public Employee	 getEmployeeById(@PathVariable("id") int id){
		return employeeService.getEmployeeById(id);
	}

	@PostMapping	("/post")
	public Employee insertEmployee(@RequestBody @Valid Employee employee){
		return employeeService.insertEmployee(employee);
	}

	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee){
		return null;
	}
	
	@DeleteMapping
	public boolean deleteEmployee(){
		return false;
	}
	
}
