package com.training.transportcomany2.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.training.transportcomany2.model.Authorities;

import com.training.transportcomany2.model.User;
import com.training.transportcomany2.repos.UserRepo;
import com.training.transportcomany2.services.UserService;

@Controller
public class LoginController {

	Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService userService;


	@Autowired
	private UserRepo userRepo;

	@ModelAttribute
	public void addCommnData(Principal p, Model m) {
		if (p != null) {
			String uname = p.getName();
			User user = userRepo.findByUname(uname);
			m.addAttribute("user", user);
		}
	}

	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	

	@GetMapping("/signUp")
	public String register() {
		return "login";
	}

	@PostMapping("/signUp")
	public String createUser(@ModelAttribute User user, HttpSession session) {
		Authorities authorities = new Authorities();

		logger.debug("* createUser() Exceution Started *");

		authorities.setAuthority("ROLE_user");
		user.setPassword(user.getPassword());
		authorities.setUname(user.getUname());
		user.setAuthorities(authorities);
		authorities.setUser(user);

		if (userService.existsUserByUname(user.getUname())) {

			logger.debug("* checkUserName()- username already exists *");

			session.setAttribute("errorMsg", "username already exists");
		}

		

		else {
			User us = userService.insert(user);
			if (us != null) {
				logger.debug("* createUser()- User Register sucesfully***");
				session.setAttribute("succMsg", "Register sucesfully");
			}

		}

		return "redirect:/authenticate";
	}

}