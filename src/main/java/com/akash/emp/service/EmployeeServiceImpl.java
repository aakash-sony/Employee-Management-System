package com.akash.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.emp.entity.Employee;
import com.akash.emp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Iterable<Employee> getAllEmployee() {
		return empRepo.findAll();
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return empRepo.findById(id).get();
	}

	@Override
	public void deleteEmployeeById(Long id) {
		empRepo.deleteById(id);
	}

}
