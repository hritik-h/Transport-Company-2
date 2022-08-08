package com.training.transportcomany2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.transportcomany2.model.Driver;

public interface DriverRepo extends JpaRepository<Driver, Long> {

}
