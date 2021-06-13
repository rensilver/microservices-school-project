package com.rensilver.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rensilver.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
