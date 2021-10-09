package com.adminportal.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.adminportal.entity.User;
import com.adminportal.entity.UserRole;

public interface UserService {
	public void save(User user);
	public User findByUsername(String username);
	public User findByEmail(String email);
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	public List<User> findAll();
	
}
