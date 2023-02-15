package com.cassiosantana.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cassiosantana.workshopmongo.domain.User;
import com.cassiosantana.workshopmongo.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}

}
