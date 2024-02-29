package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository er;
	
	@GetMapping("/")
	public String getMassege() {
		return "hiii.....";
	}
	
	@GetMapping("/getemployees")
	private List<Employee> getEmployees() {
		return (List<Employee>)er.findAll();
	}
	
	@GetMapping("/getemployeebyid/{id}")
	public Optional<Employee> getEmpById(@PathVariable Integer id){
		return er.findById(id);
	}
	
	@GetMapping("/getemployeebyname/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name){
		return (List<Employee>) er.findByEmpname(name);
	}
	
	@GetMapping("/getemployeebysalary/{sal}")
	public List<Employee> getEmployeeBySalary(@PathVariable double sal){
		return (List<Employee>)er.findByEmpsalary(sal);
	}
	
	@PostMapping("/addemployee")
	public void addEmployee(@RequestBody Employee emp) {
		er.save(emp);
	}
	
	@PostMapping("/deleteemployee/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		er.deleteById(id);
	}
	
	@PutMapping("/updateemployee/{id}")
	public Employee updateEmployee(@RequestBody Employee newEmp, @PathVariable Integer id) {
		return er.findById(id).map(employee -> {
			employee.setEmpname(newEmp.getEmpname());
			employee.setEmpsalary(newEmp.getEmpsalary());
			return er.save(employee);
		}).orElseGet(() -> {
			return er.save(newEmp);
		});
	}
}
