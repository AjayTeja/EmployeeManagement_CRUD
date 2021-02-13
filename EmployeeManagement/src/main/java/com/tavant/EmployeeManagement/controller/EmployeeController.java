package com.tavant.EmployeeManagement.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tavant.EmployeeManagement.Repository.EmployeeRepository;
import com.tavant.EmployeeManagement.exceptions.EmployeeNotFoundException;
import com.tavant.EmployeeManagement.exceptions.NoDataFoundException;
import com.tavant.EmployeeManagement.model.Employee;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping//it is used to show the root(front part)
	public String getEmployee()
{
		return "Welcom Tavant";
		}
	
	@GetMapping("/all")//it is used to get all the employee details
	public List <Employee> getAllEmployees() throws Exception
	{
		List<Employee> list=this.employeeRepository.findAll();
		return Optional.ofNullable(list.isEmpty()?null:list).orElseThrow(()->new NoDataFoundException("no data found"));
		
	}
	
	@GetMapping("/{id}")//used to read the employee details for particulat id
	public ResponseEntity<?> getEmployeeById(@PathVariable("id")Integer id)throws EmployeeNotFoundException{
		Optional<Employee> optional=employeeRepository.findById(id);
		if(optional.isPresent()) {
			return ResponseEntity.ok(optional.get());
			}
		else {
			throw new EmployeeNotFoundException("Employee not found");
		}
	}
	
	@PostMapping//it is used to post the employee object to db
	public Employee addEmployee(@RequestBody @Valid Employee employee)throws EmployeeNotFoundException{
		if(employee.getEmployeeId()==null)
		{
			throw new EmployeeNotFoundException("it is not possible to add the employee");
			
		}
		return employeeRepository.save(employee);
	}
	@DeleteMapping("/delete/{id}")//it is used to delete a particulat object
	public String deleteEmployee(@PathVariable("id")Integer id)throws EmployeeNotFoundException{
		Optional<Employee> optional=employeeRepository.findById(id);
	if(optional.isPresent()) {
		employeeRepository.deleteById(id);
		return "Employee deleted successfully";
	}
	else {
		throw new EmployeeNotFoundException("Employee not found");
	}
	}
	@PutMapping("/{id}")//it is used to update the employee details
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id")Integer id ,@Valid @RequestBody Employee resourceDetails)throws EmployeeNotFoundException{
		Employee emp=employeeRepository.findById(id).orElseThrow(()->new EmployeeNotFoundException("Record not found"));
	
		emp.setFirstname(resourceDetails.getFirstname());
		emp.setLastname(resourceDetails.getLastname());
		emp.setEmail(resourceDetails.getEmail());
		
		final Employee newDet=employeeRepository.save(emp);
		return ResponseEntity.ok(newDet);
		
	}
	
	
	
}
