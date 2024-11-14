package com.akash.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.akash.emp.entity.Employee;
import com.akash.emp.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/employees")
	public String fetchAllEmployee(Model model) {
		model.addAttribute("employeeList", empService.getAllEmployee());
		return "employeeList";
	}

	@GetMapping("/employee/new")
	public String createEmployee(Model model) {
		// create employee object to hold the form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "createEmployee";
	}

	@PostMapping("/employees")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
		if (result.hasErrors()) {
			return "createEmployee";
		}
		empService.insertEmployee(employee);
		return "redirect:/employees";
	}

	@GetMapping("/employees/edit/{id}")
	public String editEmployee(@PathVariable Long id, Model model) {
		model.addAttribute("employee", empService.getEmployeeById(id));
		return "editEmployee";
	}

	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable Long id, @ModelAttribute("employee") @Valid Employee employee,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("employee", employee);
			return "editEmployee";
		}
		Employee existingEmployee = empService.getEmployeeById(id);

		existingEmployee.setId(id);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmailId(employee.getEmailId());
		existingEmployee.setMobileNum(employee.getMobileNum());

		empService.updateEmployee(existingEmployee);
		return "redirect:/employees";
	}

	@GetMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable Long id) {
		empService.deleteEmployeeById(id);
		return "redirect:/employees";
	}
}
