package checkLocation.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import checkLocation.Entity.Location;

public interface locationRepository extends JpaRepository<Location, Long> {

	Optional<Location> findById(int i);
  
	
}
