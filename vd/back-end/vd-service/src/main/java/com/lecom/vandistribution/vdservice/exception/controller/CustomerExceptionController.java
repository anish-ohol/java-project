package com.lecom.vandistribution.vdservice.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lecom.vandistribution.vdservice.exception.CustomerNotFoundException;

@ControllerAdvice
public class CustomerExceptionController {
	
	 @ExceptionHandler(value = CustomerNotFoundException.class)
	   public ResponseEntity<Object> exception(CustomerNotFoundException exception) {
	      return new ResponseEntity<>("Customer not found", HttpStatus.NOT_FOUND);
	   }
	 

}
