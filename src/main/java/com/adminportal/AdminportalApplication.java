package com.adminportal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adminportal.entity.Role;
import com.adminportal.entity.User;
import com.adminportal.entity.UserRole;
import com.adminportal.service.SecurityService;
import com.adminportal.service.UserService;

@SpringBootApplication
public class AdminportalApplication implements CommandLineRunner{
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AdminportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setFirstname("Joseph");
//		user.setLastname("Bello");
//		user.setEmail("admin@gmail.com");
//		user.setPassword(securityService.bCryptPasswordEncoder().encode("password"));
//		user.setAddress("somewhere in lagos");
//		user.setUsername("admin");
//		Role role = new Role();
//		role.setId(0);
//		role.setName("ROLE_ADMIN");
//		Set<UserRole> userRoles = new HashSet<>();
//		userRoles.add(new UserRole(user, role));
//		
//		userService.createUser(user, userRoles);
		
		
	}

}
