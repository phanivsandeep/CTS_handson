package com.cognizant.eurekaDiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulServer
public class EurekaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryServerApplication.class, args);
	}
}