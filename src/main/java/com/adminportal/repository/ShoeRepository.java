package com.adminportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adminportal.entity.Shoe;

public interface ShoeRepository extends JpaRepository<Shoe, Long>{
	
}
