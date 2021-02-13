package com.tavant.project.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvalidDeptIdException extends Exception 
{
	
	public InvalidDeptIdException(String msg)
	{
		super(msg);
	}

	@Override
	public String toString() {
		return super.toString()+super.getMessage();
	}
	
	

}
