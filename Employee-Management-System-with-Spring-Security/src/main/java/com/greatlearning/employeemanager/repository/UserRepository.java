package com.greatlearning.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employeemanager.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User getUserByUsername(String username);
}
