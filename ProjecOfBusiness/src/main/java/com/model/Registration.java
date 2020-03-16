package com.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Registration {
	@NotEmpty(message="please enter userName")
	private String userName;
	@Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3")  
      private String password;
	@Email
	@NotEmpty(message="Must be valid email")
	 private String email;
	@Size(max=10)
	@NotEmpty(message="size must be 10 digit")
	 private String number;
	@NotNull(message="please select one of the radio button")
	private String sex;
     public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
	
     
	 public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

 
}
