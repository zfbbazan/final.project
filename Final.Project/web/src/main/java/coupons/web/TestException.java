package coupons.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.OK)
public class TestException extends RuntimeException{
	public TestException() {
		super("Dummy exception");
	}

}
