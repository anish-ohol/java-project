package com.lecom.vandistribution.vdzuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class VdZuulserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(VdZuulserverApplication.class, args);
	}

}
