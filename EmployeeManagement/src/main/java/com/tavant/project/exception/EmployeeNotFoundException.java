package com.tavant.project.exception;

public class EmployeeNotFoundException extends Exception {

	
	public EmployeeNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
	@Override
	public String toString() {
		return super.toString()+super.getMessage();
	}
	
}
