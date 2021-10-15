package com.exam.helper;

public class UserNotFoundException extends Exception {
	public UserNotFoundException() {
		super("User with this username not found in database !! Please try");
	}

	public UserNotFoundException(String msg) {
		super(msg);
	}

}
