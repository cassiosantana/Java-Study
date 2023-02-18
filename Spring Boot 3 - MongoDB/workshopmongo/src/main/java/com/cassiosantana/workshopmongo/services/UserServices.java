package com.cassiosantana.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cassiosantana.workshopmongo.domain.User;
import com.cassiosantana.workshopmongo.dto.UserDTO;
import com.cassiosantana.workshopmongo.repository.UserRepository;
import com.cassiosantana.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User update(User obj) {
		User newObject = findById(obj.getId());
		updateDate(newObject, obj);
		return repo.save(newObject);
	}
	
	private void updateDate(User newObject, User obj) {
		newObject.setName(obj.getName());
		newObject.setEmail(obj.getEmail());
	}

	public User fromDTO(UserDTO userDto) {
		return new User(userDto.getId(), userDto.getName(), userDto.getEmail());
	}
}
