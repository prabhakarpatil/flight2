package airlineRepo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="flight_details")

public class FlightDetailsJPAClass implements Serializable{
	
@Column (name="flight_departure_date")
String flight_departure_date = null;

@Column (name="avaiable_seats")
int available_seats;

@Column(name="price")
float price;

@OnetoOne (mappedBy="FlightDetailsJPAClass")
private FlightJPAClass flightjpaclass;
public String getFlight_departure_date() {
	return flight_departure_date;
}

public void setFlight_departure_date(String flight_departure_date) {
	this.flight_departure_date = flight_departure_date;
}

public int getAvailable_seats() {
	return available_seats;
}

public void setAvailable_seats(int available_seats) {
	this.available_seats = available_seats;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

}
}
