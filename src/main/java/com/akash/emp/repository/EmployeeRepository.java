package com.akash.emp.repository;

import org.springframework.data.repository.CrudRepository;

import com.akash.emp.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
