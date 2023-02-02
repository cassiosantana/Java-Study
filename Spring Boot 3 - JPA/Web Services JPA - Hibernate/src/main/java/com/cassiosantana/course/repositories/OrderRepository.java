package com.cassiosantana.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cassiosantana.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
