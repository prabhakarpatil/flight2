package airlineRepo;

import org.springframework.data.repository.CrudRepository;

import airlineRepo.FlightDetailsJPAClass;

public interface FlightDetailsCRUD extends CrudRepository<FlightDetailsJPAClass,Long>{

}
