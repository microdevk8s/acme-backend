package com.acme.backend.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.backend.model.dao.EmployeeDao;
import com.acme.backend.model.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Employee> findAll() {
		return (List<Employee>) employeeDao.findAll();
	}

	@Override
	@Transactional
	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		employeeDao.deleteById(id);
	}
	
	
	@Override
	@Transactional
	public Employee update(Employee employee, Integer key) {
		Employee current = this.findById(key);
		current.setAddress(employee.getAddress());
		current.setEmail(employee.getEmail());
		current.setName(employee.getName());
		return this.save(current);
	}

	@Override
	@Transactional(readOnly = true)
	public Employee findById(Integer key) {
		return employeeDao.findById(key).orElse(null);
	}

	
	
}
