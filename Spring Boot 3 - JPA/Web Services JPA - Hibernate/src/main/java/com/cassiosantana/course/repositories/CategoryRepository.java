package com.cassiosantana.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cassiosantana.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
