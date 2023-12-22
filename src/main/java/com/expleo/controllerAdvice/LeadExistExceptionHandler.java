package com.expleo.controllerAdvice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.expleo.error.ErrorDetails;
import com.expleo.exception.LeadExistException;

@RestControllerAdvice
public class LeadExistExceptionHandler {

	@ExceptionHandler(LeadExistException.class)
	public ResponseEntity<ErrorDetails> handleLeadExist(LeadExistException le){
		ErrorDetails details = new ErrorDetails(LocalDateTime.now(), le.getMessage());
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.BAD_REQUEST);
	}
	
	
}
