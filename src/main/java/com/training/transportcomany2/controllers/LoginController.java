package com.training.transportcomany2.controllers;
/*
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class LoginController {

	
	
	
	
//	@GetMapping("/register")
//	public String home() {
//		return "register";
//	}
	
	@GetMapping("/login")
	public String login() {
		return "index";
	}
	
	
	
	*/
	 
	
//	@PostMapping("/process_register")
//	public String processRegister(User user) {
//	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//	    String encodedPassword = passwordEncoder.encode(user.getPassword());
//	    user.setPassword(encodedPassword);
//	     
//	    userRepo.save(user);
//	     
//	    return "register_success";
//	}

//	@PostMapping("/signup")
//	 public User registerUser(@RequestBody User user) throws Exception {
//   	 String tempEmailId=user.getEmailId();
//   	 if(tempEmailId != null && !"".equals(tempEmailId)) {
//   		 User userobj=userService.fetchUserByEmailId(tempEmailId);
//   		 
//   	     if(userobj !=null) {
//   		    throw new Exception("User With "+tempEmailId+" And is already exist");
//   	     }
//   	 }
//   	 User userObj=null;  
//		 userObj=userService.saveUser(user);
//		 return userObj;
//	 }
//    
//    @PostMapping("/login")
//    public User loginUser(@RequestBody User user) throws Exception{
//   	 String tempEmailId=user.getEmailId();
//   	 String tempPassword=user.getPassword();
//   	 User userObj=null;
//   	 if(tempEmailId !=null && tempPassword !=null) {
//   		userObj= userService.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
//   	 }
//   	 if(userObj == null) {
//   		 throw new Exception ("Bad Credential");
//   	 } 
//   	 return userObj;
//    }
//}