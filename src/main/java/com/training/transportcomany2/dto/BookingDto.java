package com.training.transportcomany2.dto;

public class BookingDto {
	private int user_id;
	private String vehicle_id;
	private String source;
	private String destination;
	private int driverId;
	
	
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
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public BookingDto(int user_id, String vehicle_id, String source, String destination, int driverId) {
		super();
		this.user_id = user_id;
		this.vehicle_id = vehicle_id;
		this.source = source;
		this.destination = destination;
		this.driverId = driverId;
	}
	public BookingDto() {
		super();
	}
	
	
	
	
}
