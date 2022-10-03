package checkLocation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import checkLocation.Entity.Location;
import checkLocation.Repository.locationRepository;

@Controller
public class locationController {

	
	@Autowired
	private  locationRepository locationRepo; 
	
	
	@RequestMapping("/test")
	public String showLocation() {
		

        
		return "showLocation";
	}

	@RequestMapping("/save")
   public String Test(@ModelAttribute("location") Location location,ModelMap model)
   {
		
		locationRepo.save(location);
              
         model.addAttribute("msg", "dataSave");
	   return "showLocation";	
   }
	
	@RequestMapping("/getlocation")
	public String getLOcation(ModelMap modelMap) {
		
		//Iterable<Location> findAll = locationRepo.findAll();  // in crudRepository
		 List<Location> location = locationRepo.findAll();   //  in  japRepository 
		 modelMap.addAttribute("location", location);
		
		return "getlocation";
	}

	@RequestMapping("/deleteLocation")
   public String deleteLocation(@RequestParam("id") Long id , ModelMap modelMap) {
       locationRepo.deleteById(id);
       List<Location> findAll = locationRepo.findAll();
       modelMap.addAttribute("location", findAll);
    return "getlocation";
   }
	
	@RequestMapping("/updateTheLocation")
	public String UpdateLocation(@RequestParam("id") Long id , ModelMap modelMap) {
		     Optional<Location> findById = locationRepo.findById(id);
		        Location location = findById.get();
				/*
				 * System.out.println(location.getId()); System.out.println(location.getCode());
				 * System.out.println(location.getName());
				 * System.out.println(location.getType());
				 * 
				 */
		        modelMap.addAttribute("id", location.getId());
		       
		        modelMap.addAttribute("code", location.getCode());
		        modelMap.addAttribute("name",location.getName());
		        modelMap.addAttribute("type", location.getType());
		         System.out.println("hello");
		return "getlocation";
		
	}
	
}


