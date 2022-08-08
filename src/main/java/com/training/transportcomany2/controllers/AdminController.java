package com.training.transportcomany2.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.transportcomany2.model.Authorities;
import com.training.transportcomany2.model.Booking;
import com.training.transportcomany2.model.User;
import com.training.transportcomany2.model.Vehicle;
import com.training.transportcomany2.services.BookingService;
import com.training.transportcomany2.services.UserService;
import com.training.transportcomany2.services.VehicleService;


@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	UserService userService;
	@Autowired
	VehicleService vehicleService;
	@Autowired
	BookingService bookingService;
	
	@GetMapping("/dashboard")
	public String dahsboard(Model model) {
		return "admin-dashboard";
	}
	@PostMapping("/UserHandler-update")
	public String userHandlerUpdate(@ModelAttribute User user, Model model,HttpServletRequest request) {
		System.out.println(user.toString());
		System.out.println(request.getParameter("action"));
		int userId = userService.findUserByUname(user.getUname()).getId();
		user.setId(userId);
		Authorities authorities = new Authorities();
		if(request.getParameter("type") == "manager" ) {
			authorities.setAuthority("ROLE_manager");
		}
		else {
			authorities.setAuthority("ROLE_user");
		}
		authorities.setUname(user.getUname());
		user.setAuthorities(authorities);
		authorities.setUser(user);
		userService.insert(user);
		return "admin-dashboard";
	}
	@PostMapping("/UserHandler")
	public String userHandler(@ModelAttribute User user, Model model,HttpServletRequest request) {
		System.out.println(user.toString());
		System.out.println(request.getParameter("action"));
		Authorities authorities = new Authorities();
		if(request.getParameter("type").equals("manager") ) {
			authorities.setAuthority("ROLE_manager");
		}
		else {
			authorities.setAuthority("ROLE_user");
		}
		authorities.setUname(user.getUname());
		user.setAuthorities(authorities);
		authorities.setUser(user);
		userService.insert(user);
		return "admin-dashboard";
	}
	@PostMapping("/UserHandler-delete")
	public String userHandlerDelete(HttpServletRequest request) {
		System.out.println(request.getParameter("user-id"));
			userService.delete(Integer.parseInt(request.getParameter("user-id")));
			return "admin-dashboard";
		}
	
	@PostMapping("/BookingHandler")
	public String bookingHandler(@ModelAttribute Booking booking,Model model) {
		System.out.println(booking.toString());
		bookingService.book(booking);
		return "admin-dashboard";
	}
	
	@PostMapping("/BookingHandler-delete")
	public String cancelBooking(HttpServletRequest request) {
		bookingService.delete(Integer.parseInt(request.getParameter("booking-id")));
		return "admin-dashboard";
	}
	
	@GetMapping("/allUsers")
	public String allUsers(Model model) {
		List<User> users = userService.allUsers();
		model.addAttribute("users",users );
		for(User user:users) {
			System.out.println(user);
			
		}
		return "list-users";
	}
	
	@PostMapping("/VehicleHandler")
	public String addVehicle(Vehicle vehicle) {
		System.out.println(vehicle.toString());
		vehicleService.insert(vehicle);
		return "admin-dashboard";
	}
	
	@PostMapping("/VehicleHandler-update")
	public String updateVehicle(Vehicle vehicle) {
		vehicleService.insert(vehicle);
		return "admin-dashboard";
	}
	
	@PostMapping("/VehicleHandler-delete")
	public String updateVehicle(HttpServletRequest request) {
		System.out.println("___________Delete Vehicle_____________");
		vehicleService.deleteVehicle(Integer.parseInt(request.getParameter("vehicle-id")));
		return "admin-dashboard";
	}
}
