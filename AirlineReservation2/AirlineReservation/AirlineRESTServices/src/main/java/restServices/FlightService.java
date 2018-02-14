package restServices;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FlightService implements IOperationsInterface {
	
	@Autowired
	FlightService flightDAO;


	@Override
	public FlightJPAClass findbyID(int id) {
		// TODO Auto-generated method stub
		FlightJPACClass flight =   flightDAO.findbyID(id);
		return null;
	}

	@Override
	public boolean createFlightDetails(FlightJPAClass f) {
		FlightJPACClass flight = flightDAO.createFlightDetails(f);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<FlightJPAClass> readFlightInfo() {
		// TODO Auto-generated method stub
		FlightJPACClass flight = flightDAO.findbyID(id);
		return null;
	}

	@Override
	public boolean updateFlightDetails(FlightJPAClass f) {
		// TODO Auto-generated method stub
		FlightJPACClass flight = flightDAO.updateFlightDetails(f);
		return false;
	}

	@Override
	public boolean deleteFlightDetails(int id) {
		// TODO Auto-generated method stub
		FlightJPACClasss flight = flightDAO.deleteFlightDetails(id);
		return false;
	}
	
	
	
	

}
