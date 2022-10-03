package checkLocation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkLocation.Entity.Location;
import checkLocation.Repository.locationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRestController {

	
	@Autowired
	private locationRepository locationRepo;
	
	@GetMapping
	public List<Location> getAllLocation(){
		return locationRepo.findAll();
	}
	
	public void savelocation() {
		
	}


}
