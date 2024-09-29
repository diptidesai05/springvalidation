package com.practice.entities;

import jakarta.validation.constraints.Pattern;

public class LoginData {
	
	@jakarta.validation.constraints.NotBlank(message = "User name can not be empty")
	@jakarta.validation.constraints.Size(min = 3, max =12 , message ="user name must be between 3 to 12")
	private String userName;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email !!")
	private String emailId;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public LoginData(String userName, String emailId) {
		super();
		this.userName = userName;
		this.emailId = emailId;
	}
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", emailId=" + emailId + "]";
	}

}
