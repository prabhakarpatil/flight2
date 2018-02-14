package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name="flight")
public class FlightJPAClass implements Serializable{

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column (name="flight_id")
     private int flight_id;
     
     @Column (name="airline_id")
     int airline_id;
     
     @Column (name="airline_name")
     String airline_name = null;
     
     @Column (name="from_location")
     String from_location = null;
     
     @Column (name="to_location")
     String to_location = null;
     
     @Column (name="departure_time")
     String departure_time = null;
     
     @Column (name="arrival_time")
     String arrival_time = null;
     
     @Column (name="duration")
     String duration = null;
     
     @Column (name="total_seats")
     int total_seats;
     
     @OnetoOne (mappedBy="FlightJPAClass")
     @JoinColumn(name="flight_id_fk", referencedColumnName="flight_id")
     private FlightDetailsJPAClass flight_details;

     public FlightJPAClass() {
     	
     }

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public int getAirline_id() {
		return airline_id;
	}

	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}

	public String getAirline_name() {
		return airline_name;
	}

	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	public String getFrom_location() {
		return from_location;
	}

	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}

	public String getTo_location() {
		return to_location;
	}

	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}

	public Flight_Details getFlight_details() {
		return flight_details;
	}

	public void setFlight_details(Flight_Details flight_details) {
		this.flight_details = flight_details;
	}

}
