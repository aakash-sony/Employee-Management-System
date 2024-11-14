package com.akash.emp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Employee {
	@Id
	@SequenceGenerator(name = "emp_gen", sequenceName = "emp_seq", initialValue = 101, allocationSize = 1)
	@GeneratedValue(generator = "emp_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotBlank(message = "First name is mandatory!!")
	@Size(min = 2, max = 25, message = "First name must be 2 to 25 characters!!")
	private String firstName;

	@Size(max = 20, message = "Last name must be 0 to 20 characters!!")
	private String lastName;

	@Email(regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$", message = "Email should be valid!!")
	private String emailId;

	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Mobile number should be 10 digits and start with 6, 7, 8, or 9 !!")
	private String mobileNum;

	public Employee(String firstName, String lastName, String emailId, String mobileNum) {

		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNum = mobileNum;
	}

}
