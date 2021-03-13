package com.bbchain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbchain.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
