package com.renocrewsolutaion.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.renocrewsolutaion.vehicle.Entity")

public class Vehical1Application {

	public static void main(String[] args) {
		SpringApplication.run(Vehical1Application.class, args);

	
	
	}

}
