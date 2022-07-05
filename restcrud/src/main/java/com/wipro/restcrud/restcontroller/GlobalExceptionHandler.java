package com.wipro.restcrud.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ResponseStatus(reason = "Some error occur at global level",code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(NullPointerException.class)
	public  void   handler() {
		
		
		System.out.println("Handler executed..");
		
	}
	
	

}
