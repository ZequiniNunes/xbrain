package com.xbrain.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xbrain.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}