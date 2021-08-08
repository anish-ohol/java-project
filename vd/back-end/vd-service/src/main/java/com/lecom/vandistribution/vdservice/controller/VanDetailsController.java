package com.lecom.vandistribution.vdservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lecom.vandistribution.vdservice.dto.VanDetailsDTO;
import com.lecom.vandistribution.vdservice.service.VanDetailsService;

@CrossOrigin
@RestController
public class VanDetailsController {
	
	@Autowired
	private VanDetailsService vanDetailsService;
	
	@GetMapping("/van")
	public List<VanDetailsDTO>getVanDetails(){		
		return vanDetailsService.getVanDetails();		
	}
	
	@GetMapping("/van/{id}")
	public VanDetailsDTO getVanDetails(@PathVariable Integer id){		
		return vanDetailsService.getVanDetails(id);		
	}
	
	@GetMapping("/van/number/{number}")
	public VanDetailsDTO getVanDetails(@PathVariable String number){		
		return vanDetailsService.getVanDetails(number);		
	}
	
	@PutMapping("/van/{id}")
	public VanDetailsDTO updateVanDetails(@PathVariable Integer id, @RequestBody VanDetailsDTO vanDetailsDTO){		
		return vanDetailsService.updateVanDetails(id, vanDetailsDTO);		
	}
	
	@PostMapping("/van")
	public VanDetailsDTO addVanDetails( @RequestBody VanDetailsDTO vanDetailsDTO){		
		return vanDetailsService.addVanDetails(vanDetailsDTO);		
	}	

	@DeleteMapping("/van/{id}")
	public Boolean removeVanDetails(@PathVariable Integer id){		
		return vanDetailsService.removeVanDetails(id);		
	}	

}
