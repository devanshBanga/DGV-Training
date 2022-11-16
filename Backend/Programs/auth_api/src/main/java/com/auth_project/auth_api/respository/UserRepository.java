package com.auth_project.auth_api.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth_project.auth_api.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
