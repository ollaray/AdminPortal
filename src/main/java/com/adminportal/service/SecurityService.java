package com.adminportal.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public interface SecurityService {
	boolean isAuthenticated();
	void autoLogin(String username, String password);
	BCryptPasswordEncoder bCryptPasswordEncoder();
}
