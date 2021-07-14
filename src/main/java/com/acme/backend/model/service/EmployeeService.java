package com.acme.backend.model.service;

import java.util.List;

import com.acme.backend.model.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee save(Employee employee);
	
	public void delete(Integer id);
	
	public Employee update(Employee employee,Integer key);
	
	public Employee findById(Integer key);
	
	public List<Employee> findByidDepartment(Integer idDepartment);
	
}
