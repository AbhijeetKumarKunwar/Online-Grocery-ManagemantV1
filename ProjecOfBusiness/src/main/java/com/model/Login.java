package com.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Login 
{
	@NotEmpty(message="Enter Email")
	@Email
	private String userName;
	@Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3")  
	@NotEmpty
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
