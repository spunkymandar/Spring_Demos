package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.StudentNotFoundException;

@ControllerAdvice
@RestController
public class MyExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(StudentNotFoundException.class)
	public final ResponseEntity<ExceptionReponse> handleException(StudentNotFoundException exception, WebRequest request){
		ExceptionReponse exceptionReponse=new ExceptionReponse(new Date(), exception.getMessage(), 
				request.getDescription(false));
		return new ResponseEntity<>(exceptionReponse,HttpStatus.NOT_FOUND);
	}

}
