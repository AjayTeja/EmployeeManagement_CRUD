package com.tavant.EmployeeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="Employee")
@Table(name="employee")
public class Employee {
    
	
	@Id
	private Integer employeeId;
	private String firstname;
	private String lastname;
	private String email;
	
}
