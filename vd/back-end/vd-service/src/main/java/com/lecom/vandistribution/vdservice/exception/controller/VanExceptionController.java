package com.lecom.vandistribution.vdservice.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lecom.vandistribution.vdservice.exception.VanNotFoundException;

@ControllerAdvice
public class VanExceptionController {
	
	 @ExceptionHandler(value = VanNotFoundException.class)
	   public ResponseEntity<Object> exception(VanNotFoundException exception) {
	      return new ResponseEntity<>("Van not found", HttpStatus.NOT_FOUND);
	   }
	 

}
