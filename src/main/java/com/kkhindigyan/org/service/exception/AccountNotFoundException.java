package com.kkhindigyan.org.service.exception;
/**
 * @author Kishan Kumar
 *Custom Exception Class
 */
public class AccountNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public AccountNotFoundException(String message) {
		super(message);
	}
}
