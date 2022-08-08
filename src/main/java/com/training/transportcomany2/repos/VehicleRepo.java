package com.training.transportcomany2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.transportcomany2.model.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {

}
