package com.training.transportcomany2.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author Hritik
 *	Booking Entity
 */
@Entity
public class Booking {
	@Override
	public String toString() {
		return "Booking [user_id=" + user_id + ", vehicle_id=" + vehicle_id + ", source=" + source + ", destination="
				+ destination + ", driverId=" + driverId + ", date=" + date + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int user_id;
	String vehicle_id;
	String source;
	String destination;
	int driverId;
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	Date date;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Booking(int user_id, String vehicle_id, String source, String destination, int driverId, Date date) {
		super();
		this.user_id = user_id;
		this.vehicle_id = vehicle_id;
		this.source = source;
		this.destination = destination;
		this.driverId = driverId;
		this.date = date;
	}
	public Booking() {
		// TODO Auto-generated constructor stub
	}
}
