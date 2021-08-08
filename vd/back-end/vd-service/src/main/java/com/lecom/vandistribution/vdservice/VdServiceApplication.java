package com.lecom.vandistribution.vdservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VdServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VdServiceApplication.class, args);
	}

	@Bean(name="entityModelMapper")
	public ModelMapper modelMapper(){
	    return new ModelMapper();
	}

}
