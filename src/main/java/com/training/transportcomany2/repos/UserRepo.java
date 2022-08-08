package com.training.transportcomany2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.transportcomany2.model.User;
public interface UserRepo extends JpaRepository<User, Integer> {
	User findByUname(String name);
}
