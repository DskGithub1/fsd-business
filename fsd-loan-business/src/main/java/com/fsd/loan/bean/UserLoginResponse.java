package com.fsd.loan.bean;

public class UserLoginResponse extends UserLoginRequest {
	private String applicationKey;
	private String message;

	// Constructors
	public UserLoginResponse() {
	}

	public UserLoginResponse(String applicationKey, String message) {
		this.applicationKey = applicationKey;
		this.message = message;
	}

	// Getters and setters
	public String getApplicationKey() {
		return applicationKey;
	}

	public void setApplicationKey(String applicationKey) {
		this.applicationKey = applicationKey;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
