import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class FlightJPAClass {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int flight_id;
     int airline_id;
     String airline_name = null;
     String from_location = null;
     String to_location = null;
     String departure_time = null;
     String arrival_time = null;
     String duration = null;
     int total_seats;

public int get_flight_id(){
     return flight_id;
}
public void set_Id(int id){
this.flight_id = id;

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
}
