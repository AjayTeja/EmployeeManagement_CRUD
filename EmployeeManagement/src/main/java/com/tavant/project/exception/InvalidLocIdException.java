package com.tavant.project.exception;

public class InvalidLocIdException extends Exception 
{
	public InvalidLocIdException(String msg)
	{
		super(msg);
	}

	@Override
	public String toString() {
		return super.toString()+super.getMessage();
	}

}
