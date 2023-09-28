package com.sunil.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunil.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
