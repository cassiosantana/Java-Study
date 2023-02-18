package com.cassiosantana.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cassiosantana.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
