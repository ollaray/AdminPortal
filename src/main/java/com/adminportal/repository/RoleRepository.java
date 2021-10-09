package com.adminportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adminportal.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	Role findByName(String name);
}
