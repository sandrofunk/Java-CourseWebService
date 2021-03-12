package com.bbchain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbchain.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
