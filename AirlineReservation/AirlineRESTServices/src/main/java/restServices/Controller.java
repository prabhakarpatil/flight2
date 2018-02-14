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

public class Controller {

	@RestController
	@RequestMapping("/airline")
	public class Controller {

	    final static Logger logger = Logger.getLogger(Controller.class);
	   
	    @Autowired
	    private UserService userService;


	    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
	    public ResponseEntity<?> getUsers() {
	        logger.debug("getUsers method called");
	        List<User> users = userService.loadUsers();
	        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	    }

	    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
	    public ResponseEntity<User> registerUser(@RequestBody User user) {
	    	logger.debug("registerUser method called");
	    	userService.addUser(user);
	    	return new ResponseEntity<User>(user, HttpStatus.CREATED);
	    }

	    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	    public ResponseEntity<User> loadUser(@PathVariable String userId) throws UserNotFoundException {
	        logger.debug("loadUser method called with userId: " + userId);
	        User user = userService.loadUserById(userId);
	        return new ResponseEntity<>(user, HttpStatus.OK);
	    }

	    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
	    public ResponseEntity<?> deleteUser(@PathVariable String userId) throws UserNotFoundException {
	        logger.debug("deleteUser method called");
	        boolean deleted = userService.deleteUser(userId);
	        if (deleted) {
	        	return new ResponseEntity<>(HttpStatus.ACCEPTED);
	        } else {
	        	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	    
	    @RequestMapping(value = {"/", ""}, method = RequestMethod.PUT)
	    public ResponseEntity<User> updateUser(@RequestBody User user) {
	    	logger.debug("registerUser method called");
	    	userService.addUser(user);
	    	return new ResponseEntity<User>(user, HttpStatus.CREATED);
	    }
	}

}
