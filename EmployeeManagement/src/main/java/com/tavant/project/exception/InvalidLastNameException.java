package com.tavant.project.exception;

public class InvalidLastNameException extends Exception {

	public InvalidLastNameException(String msg)
	{
		super(msg);
	}
	
	@Override
	public String toString() {
		return super.toString()+super.getMessage();
	}
	
}
