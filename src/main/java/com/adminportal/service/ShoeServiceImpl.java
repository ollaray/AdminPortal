package com.adminportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.entity.Shoe;
import com.adminportal.repository.ShoeRepository;

@Service
public class ShoeServiceImpl implements ShoeService{
	
	@Autowired
	private ShoeRepository shoeRepository;
	
	@Override
	public Shoe save(Shoe shoe) {
		return shoeRepository.save(shoe);
	}

	@Override
	public List<Shoe> findAll() {
		return shoeRepository.findAll();
	}

}
