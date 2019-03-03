package com.org.exceptions;

public class InvalidInputException extends IllegalArgumentException {
	
	private static final long serialVersionUID = 1L;

	public InvalidInputException(String exception){
		super(exception);
	}

}
