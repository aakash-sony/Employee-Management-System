package com.akash.emp.service;

import com.akash.emp.entity.Employee;

public interface EmployeeService {
	public Iterable<Employee> getAllEmployee();

	public Employee insertEmployee(Employee employee);

	public Employee getEmployeeById(Long id);

	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployeeById(Long id);
}
