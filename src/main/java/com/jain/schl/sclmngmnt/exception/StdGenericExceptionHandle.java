package com.jain.schl.sclmngmnt.exception;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class StdGenericExceptionHandle extends ResponseEntityExceptionHandler {
	@ExceptionHandler({ NullPointerException.class })
	public ResponseEntity<Object> handleAccessDeniedException(Exception ex, WebRequest request) {
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", new Date());
		// Get all errors
		body.put("errors", "Server is down !!! Try after some time !!!");
		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.FORBIDDEN);
	}

}