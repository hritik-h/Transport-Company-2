package com.training.transportcomany2.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.transportcomany2.exceptions.UserNotFoundException;
import com.training.transportcomany2.model.Authorities;
import com.training.transportcomany2.model.Booking;
import com.training.transportcomany2.model.User;
import com.training.transportcomany2.model.Vehicle;
import com.training.transportcomany2.services.BookingService;
import com.training.transportcomany2.services.UserService;
import com.training.transportcomany2.services.VehicleService;

/**
 * 
 * @author Hritik
 * Handles Request from admin side
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	UserService userService;
	@Autowired
	VehicleService vehicleService;
	@Autowired
	BookingService bookingService;
	
	private static final String DASHBOARD = "admin-dashboard";
	
	/**
	 * 
	 * @param model
	 * @return jsp page name (String)
	 * 
	 * directs to dashboard
	 */
	@GetMapping("/dashboard")
	public String dahsboard(Model model) {
		return DASHBOARD;
	}
	
	@ExceptionHandler(value =UserNotFoundException.class)
	public String error(Model m,Exception ex) {
		m.addAttribute("msg", ex.getLocalizedMessage());
		return "error-page";
	}
	/**
	 * 
	 * @param user
	 * @param model
	 * @param request
	 * @return admin dashboard
	 * 
	 * Handles Updation of user database
	 */
	@PostMapping("/UserHandler-update")
	public String userHandlerUpdate(@ModelAttribute User user, Model model,HttpServletRequest request) {
		
		logger.trace("User: {}",user);
		logger.trace("Parameter: {}",request.getParameter("action"));
		int userId = userService.findUserByUname(user.getUname()).getId();
		user.setId(userId);
		Authorities authorities = new Authorities();
		if(request.getParameter("type").equalsIgnoreCase("manager")) {
			authorities.setAuthority("ROLE_manager");
		}
		else {
			authorities.setAuthority("ROLE_user");
		}
		authorities.setUname(user.getUname());
		user.setAuthorities(authorities);
		authorities.setUser(user);
		userService.insert(user);
		return DASHBOARD;
	}
	
	/**
	 * 
	 * @param user
	 * @param model
	 * @param request
	 * @return admin-dashboard
	 * 
	 * Adds User to database
	 */
	@PostMapping("/UserHandler")
	public String userHandler(@ModelAttribute User user, Model model,HttpServletRequest request) {
		
		logger.trace("User: {}",user);
		logger.trace("Action: {}",request.getParameter("action"));
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
		System.out.println(user);
		System.out.println(authorities);
		userService.insert(user);
		
		return DASHBOARD;
	}
	/**
	 * 
	 * @param request
	 * @return Admin Dashboard
	 * 
	 * Deletes user from database based on user-id
	 */
	@PostMapping("/UserHandler-delete")
	public String userHandlerDelete(HttpServletRequest request) {
		logger.trace(request.getParameter("user-id"));
			userService.delete(Integer.parseInt(request.getParameter("user-id")));
			return DASHBOARD;
		}
	
	/**
	 * 
	 * @param booking
	 * @param model
	 * @return admin dashboard
	 * 
	 * Handles booking request
	 */
	@PostMapping("/BookingHandler")
	public String bookingHandler(@ModelAttribute Booking booking,Model model) {
		logger.trace("Booking info: {}",booking);
		bookingService.book(booking);
		return DASHBOARD;
	}
	
	/**
	 * 
	 * @param request
	 * @return admin dashboard
	 * 
	 * Handles Cancel of Bookings
	 */
	@PostMapping("/BookingHandler-delete")
	public String cancelBooking(HttpServletRequest request) {
		
		bookingService.delete(Integer.parseInt(request.getParameter("booking-id")));
		return DASHBOARD;
	}
	
	/**
	 * 
	 * @param model
	 * @return list-users page
	 * 
	 * Shows All users in database
	 */
	@GetMapping("/allUsers")
	public String allUsers(Model model) {
		List<User> users = userService.allUsers();
		model.addAttribute("list", users);
		return "list-users";
	}
	
	/**
	 * View one user
	 * @throws UserNotFoundException 
	 */
	@GetMapping("/viewUser")
	public String OneUser(Model model, HttpServletRequest request) throws UserNotFoundException {
		Optional<User> op = userService.findUser(Integer.parseInt(request.getParameter("user-id")));
		//User user = userService.findUser(Integer.parseInt(request.getParameter("user-id"))).get();
		if(op.isPresent()) {
		User user = op.get();
		List<User> users = new ArrayList<User>() ;
		
		users.add(user);
		if (user!=null) {
			model.addAttribute("list", users);
		}
		return "list-users";
		}
		else {
			throw new UserNotFoundException("No User Found with the Given Id");
		}
	}
	/**
	 * 
	 * @param model
	 * @return list-vehicles page
	 * 
	 * Shows all Vehicles in database
	 */
	@GetMapping("/allVehicles")
	public String allVehicles(Model model) {
		List<Vehicle> vehicles = vehicleService.allVehicles();
		model.addAttribute("list", vehicles);
		return "list-vehicles";
	}
	

	/**
	 * View Vehicle
	 */
	@GetMapping("/viewVehicle")
	public String oneVehicle(Model model, HttpServletRequest request) {
		Vehicle vehicle = vehicleService.findVehicle(Integer.parseInt(request.getParameter("vehicle-id"))).get();
		List<Vehicle> vehicles = new ArrayList<Vehicle>() ;
		vehicles.add(vehicle);
		if (vehicle!=null) {
			model.addAttribute("list", vehicles);
		}
		return "list-vehicles";
	}
	
	/**
	 * 
	 * @param model
	 * @return list-booking jsp page
	 * 
	 * shows all the booking
	 */
	@GetMapping("/allBookings")
	public String allBookings(Model model) {
		List<Booking> bookings = bookingService.allBookings();
		model.addAttribute("list", bookings);
		return "list-booking";
	}
	
	/**
	 * 
	 * @param vehicle
	 * @return admin-dashboard page
	 * 
	 * Adds Vehicles into database
	 */
	@PostMapping("/VehicleHandler")
	public String addVehicle(Vehicle vehicle) {
		logger.trace("Vehicle: {}",vehicle);
		vehicleService.insert(vehicle);
		return DASHBOARD;
	}
	
	/**
	 * 
	 * @param vehicle
	 * @return admin-dashboard jsp page
	 * 
	 * updates vehicle database
	 */
	@PostMapping("/VehicleHandler-update")
	public String updateVehicle(Vehicle vehicle) {
		vehicleService.insert(vehicle);
		return DASHBOARD;
	}
	
	/**
	 * 
	 * @param request
	 * @return admin dashboard jsp page
	 * 
	 * deletes vehicle from database
	 */
	@PostMapping("/VehicleHandler-delete")
	public String updateVehicle(HttpServletRequest request) {
		vehicleService.deleteVehicle(Integer.parseInt(request.getParameter("vehicle-id")));
		return DASHBOARD;
	}
}
