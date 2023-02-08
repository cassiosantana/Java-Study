package com.cassiosantana.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cassiosantana.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
