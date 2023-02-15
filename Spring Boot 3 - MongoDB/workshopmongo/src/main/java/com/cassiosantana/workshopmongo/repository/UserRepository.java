package com.cassiosantana.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cassiosantana.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
