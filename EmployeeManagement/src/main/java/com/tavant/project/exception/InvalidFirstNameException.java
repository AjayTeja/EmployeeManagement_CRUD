package com.tavant.project.exception;

public class InvalidFirstNameException extends Exception
{
	public InvalidFirstNameException(String msg)
	{
		super(msg);
	}
	
	@Override
	public String toString() {
		return super.toString()+super.getMessage();
	}

}
