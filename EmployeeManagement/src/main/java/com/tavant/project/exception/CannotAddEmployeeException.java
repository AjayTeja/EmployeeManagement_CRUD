package com.tavant.project.exception;

public class CannotAddEmployeeException extends Exception {
	public CannotAddEmployeeException(String msg) {
		// TODO Auto-generated constructor stub
		
		super(msg);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+super.getMessage();
	}

}
