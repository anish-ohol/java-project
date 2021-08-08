package com.lecom.vandistribution.vdservice.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.lecom.vandistribution.vdservice.exception.AppConfigNotFoundException;
import com.lecom.vandistribution.vdservice.exception.AppConfigSavedException;

@ControllerAdvice
public class AppConfigExeptionController {	
	
	 @ExceptionHandler(value = AppConfigNotFoundException.class)
	   public ResponseEntity<Object> exception(AppConfigNotFoundException exception) {
	      return new ResponseEntity<>("AppConfig not found", HttpStatus.NOT_FOUND);
	   }
	 
	 @ExceptionHandler(value = AppConfigSavedException.class)
	   public ResponseEntity<Object> exception(AppConfigSavedException exception) {
	      return new ResponseEntity<>("Unable to save AppConfig", HttpStatus.INTERNAL_SERVER_ERROR);
	   }

}
