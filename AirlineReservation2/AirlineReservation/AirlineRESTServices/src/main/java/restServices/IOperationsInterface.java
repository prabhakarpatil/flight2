package restServices;
import java.util.List;
import com.example.demo.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


public interface IOperationsInterface {
	
FlightJPAClass findbyID(int id);
	
	boolean createFlightDetails(FlightJPAClass f);
	
	List<FlightJPAClass> readFlightInfo();
	
	boolean updateFlightDetails(FlightJPAClass f);
	
	boolean deleteFlightDetails(int id);

	
	
}
