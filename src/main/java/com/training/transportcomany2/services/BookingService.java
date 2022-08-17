package com.training.transportcomany2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.transportcomany2.model.Booking;
import com.training.transportcomany2.repos.BookingRepo;
/**
 * 
 * @author Hritik
 * 
 * Services for booking table
 */
@Service
public class BookingService {
	
	@Autowired
	BookingRepo bookingRepo;
	
	public void book(Booking booking) {
		bookingRepo.save(booking);
	}
	
	public List<Booking> allBookings(){
		return bookingRepo.findAll();
	}
	
	public Optional<Booking> findBooking(int id) {
		return bookingRepo.findById(id);
	}
	
	public void delete(int id) {
		bookingRepo.deleteById(id);
	}
}
