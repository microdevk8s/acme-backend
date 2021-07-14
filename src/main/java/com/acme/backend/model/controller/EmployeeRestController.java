package com.acme.backend.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acme.backend.model.entity.Employee;
import com.acme.backend.model.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> listar(){
		return employeeService.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee buscar(@PathVariable Integer id) {
		return employeeService.findById(id);
	}
	
	@GetMapping("/employees/{idDepartment}")
	public List<Employee> findByDepartment(@PathVariable Integer idDepartment) {
		return employeeService.findByidDepartment(idDepartment);
	}
	
	@PostMapping("/employee")
	@ResponseStatus(HttpStatus.CREATED)
	public Employee guardar(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Integer id) {
		employeeService.delete(id);
	}
	
	@PutMapping("/employee/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Employee actualizar(@RequestBody Employee employee,@PathVariable Integer id) {
		return employeeService.update(employee, id);
	}
	
}
