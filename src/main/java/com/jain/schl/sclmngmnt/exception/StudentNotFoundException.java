package com.jain.schl.sclmngmnt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class StudentNotFoundException  extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException(String message){
		super(message);
	}

}
