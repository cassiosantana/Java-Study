package com.cassiosantana.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cassiosantana.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
