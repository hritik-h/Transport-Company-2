package com.training.transportcomany2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.transportcomany2.model.User;
import com.training.transportcomany2.repos.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	public void insert(User user) {
		
		userRepo.save(user);
	}
	public List<User> allUsers(){
		return userRepo.findAll();
	}
	
	public Optional<User> findUser(int id){
		return userRepo.findById(id);
	}
	
	public void delete(int id) {
		userRepo.deleteById(id);
	}
	
	public User findUserByUname(String uname) {
		return userRepo.findByUname(uname);
	}
}
