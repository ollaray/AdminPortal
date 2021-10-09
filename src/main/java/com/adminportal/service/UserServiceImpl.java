package com.adminportal.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.adminportal.entity.User;
import com.adminportal.entity.UserRole;
import com.adminportal.repository.RoleRepository;
import com.adminportal.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCPE;
	
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	public void save(User user) {
		user.setPassword(bCPE.encode(user.getPassword()));
		user.setRoles(new HashSet<>(roleRepository.findAll()));
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User usr = userRepository.findByUsername(user.getUsername());
		if(usr != null) {
			LOG.info("User {} already exist", user.getUsername());
		}else {
			for(UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			usr = userRepository.save(user);
		}
		return usr;
	
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	
}
