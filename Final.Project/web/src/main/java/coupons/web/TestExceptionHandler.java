package coupons.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TestExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handle(Exception e){
		e.printStackTrace();
		return ResponseEntity.ok("ERROR: " + e.getMessage());
	}

}
