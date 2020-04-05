package com.example.demo.form;
import org.springframework.beans.factory.annotation.Value;
public class LoginForm {
	private String username;
	private String password;
	public LoginForm() {
		super();
	}
	
	public String getUsername() {
		return username;
	}
	@Value("fresherpro")
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	@Value("fresherpro")
	public void setPassword(String password) {
		this.password = password;
	}

}
