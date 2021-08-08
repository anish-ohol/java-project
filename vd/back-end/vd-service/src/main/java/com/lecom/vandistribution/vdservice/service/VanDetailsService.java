package com.lecom.vandistribution.vdservice.service;

import java.util.List;

import com.lecom.vandistribution.vdservice.dto.VanDetailsDTO;

public interface VanDetailsService {
	
	public List<VanDetailsDTO> getVanDetails();
	public VanDetailsDTO getVanDetails(Integer id);
	public VanDetailsDTO getVanDetails(String number);
	public VanDetailsDTO updateVanDetails(Integer id,VanDetailsDTO vanDetailsDTO);
	public VanDetailsDTO addVanDetails(VanDetailsDTO vanDetailsDTO);
	public Boolean removeVanDetails(Integer id);
}
