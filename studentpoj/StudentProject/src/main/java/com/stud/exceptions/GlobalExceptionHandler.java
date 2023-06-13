package com.stud.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exception(Exception exception,WebRequest webRequest){
		return new ResponseEntity<>(new MyErrorDetails(LocalDateTime.now(),exception.getMessage(),webRequest.getDescription(false)),HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails>methodexception(MethodArgumentNotValidException methodArgumentNotValidException,WebRequest webRequest){
		return new ResponseEntity<>(new MyErrorDetails(LocalDateTime.now(),"error",methodArgumentNotValidException.getBindingResult().getFieldError().getDefaultMessage()),HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> handlefound(NoHandlerFoundException noHandlerFoundException,WebRequest webRequest){
		return new ResponseEntity<>(new MyErrorDetails(LocalDateTime.now(),noHandlerFoundException.getMessage(),webRequest.getDescription(false)),HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails>grocerhandle(StudentException userException,WebRequest webRequest){
		return new ResponseEntity<>(new MyErrorDetails(LocalDateTime.now(),userException.getMessage(),webRequest.getDescription(false)),HttpStatus.BAD_REQUEST);
	}
	
	
}