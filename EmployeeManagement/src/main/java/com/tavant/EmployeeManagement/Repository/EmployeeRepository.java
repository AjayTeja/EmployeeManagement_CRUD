package com.tavant.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tavant.EmployeeManagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
