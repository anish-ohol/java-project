package com.lecom.vandistribution.vdservice.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VdUtil {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public <S, T> List<T> mapObjectList(List<S> source, Class<T> targetClass) {
		
		
	    return source
	    	      .stream()
	    	      .map(element -> modelMapper.map(element, targetClass))
	    	      .collect(Collectors.toList());
		
	}
	
	public <S, T> T mapObject(S source, Class<T> targetClass) {
	    return modelMapper.map(source, targetClass);   	      
	}
		
	
	private Long addDays(int days){
	    Long result = Long.valueOf(days * 24 * 60 * 60 * 1000);
	    return result;
	}

}
