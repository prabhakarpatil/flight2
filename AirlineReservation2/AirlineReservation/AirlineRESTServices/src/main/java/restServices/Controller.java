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


	@RestController
	@RequestMapping("/airline")
public class Controller {

	    final static Logger logger = Logger.getLogger(Controller.class);
	   
	    @Autowired
	    private IOperationsInterface Controller;


	    @RequestMapping(value = {"/", "findbyID"}, method = RequestMethod.GET)
	    public ResponseEntity<?> getUsers() {
	        logger.debug("getUsers method called");
	        List<FlightJPAClass> users = userService.loadUsers();
	        return new ResponseEntity<List<FlightJPAClass>>(FlightJPAClass, HttpStatus.OK);
	    }

	    @RequestMapping(value = {"/", "findbyID"}, method = RequestMethod.POST)
	    public ResponseEntity<FlightJPAClass> registerUser(@RequestBody FlightJPAClass user) {
	    	logger.debug("registerUser method called");
	    	flightDAO.createFlightDetails(f);
	    	return new ResponseEntity<Controller>(user, HttpStatus.CREATED);
	    }

	    @RequestMapping(value = "/{findbyID}", method = RequestMethod.GET)
	    public ResponseEntity<Controller> loadUser(@PathVariable String id) throws UserNotFoundException {
	        logger.debug("loadUser method called with userId: " + id);
	        Controller user = flightDAO.findbyID(id);
	    }

	    @RequestMapping(value = "/{findbyID}", method = RequestMethod.DELETE)
	    public ResponseEntity<?> deleteUser(@PathVariable String userId) throws UserNotFoundException {
	        logger.debug("deleteUser method called");
	        boolean deleted = flightDAO.deleteFlightDetails(id);;
	        if (deleted) {
	        	return new ResponseEntity<>(HttpStatus.ACCEPTED);
	        } else {
	        	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	    
	    @RequestMapping(value = {"/", ""}, method = RequestMethod.PUT)
	    public ResponseEntity<Controller> updateUser(@RequestBody Controller user) {
	    	logger.debug("registerUser method called");
	    	Controller user = flightDAO.updateFlightDetails(f);
	    	return new ResponseEntity<Controller>(user, HttpStatus.CREATED);
	    }
	}

}
