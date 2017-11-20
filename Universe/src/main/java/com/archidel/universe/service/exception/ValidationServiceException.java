package com.archidel.universe.service.exception;

public class ValidationServiceException extends ServiceException{
	private static final long serialVersionUID = 1L;

	public ValidationServiceException() {
	}

	public ValidationServiceException(String message) {
		super(message);
	}

	public ValidationServiceException(Exception e) {
		super(e);
	}

	public ValidationServiceException(String message, Exception e) {
		super(message, e);
	}

	
}
