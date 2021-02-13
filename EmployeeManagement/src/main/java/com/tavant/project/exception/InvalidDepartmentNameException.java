package com.tavant.project.exception;

public class InvalidDepartmentNameException extends Exception {

	public InvalidDepartmentNameException(String msg)
	{
		super(msg);
	}
	
	@Override
	public String toString() {
		return super.toString()+super.getMessage();
	}
}
