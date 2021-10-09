package com.adminportal.service;

import java.util.List;

import com.adminportal.entity.Shoe;

public interface ShoeService {
	Shoe save(Shoe shoe);
	List<Shoe> findAll();
	
}
