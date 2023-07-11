package com.in28minutes.springBoot.firstWebApp.login;

public class AuthService {
	public boolean Authenticate(String name,String password) {
		boolean isValidName=name.equalsIgnoreCase("admin");
		boolean isValidPassword=password.equalsIgnoreCase("dummy");
		return isValidName && isValidPassword;
	}

}
