package com.acme.backend.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.acme.backend.model.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
