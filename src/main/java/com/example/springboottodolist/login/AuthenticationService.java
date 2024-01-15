package com.example.springboottodolist.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("sid");
		boolean isValidPassword = username.equalsIgnoreCase("sid");
		
		return isValidUserName && isValidPassword; 
	}
}
