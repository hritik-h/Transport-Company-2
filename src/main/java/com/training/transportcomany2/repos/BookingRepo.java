package com.training.transportcomany2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.transportcomany2.model.Booking;

public interface BookingRepo extends JpaRepository<Booking,Integer> {

}
