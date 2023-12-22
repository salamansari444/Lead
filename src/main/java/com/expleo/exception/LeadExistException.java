package com.expleo.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

public class LeadExistException extends RuntimeException {

	public LeadExistException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	
	
	

}
