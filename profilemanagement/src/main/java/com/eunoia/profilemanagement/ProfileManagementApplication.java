package com.eunoia.profilemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProfileManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileManagementApplication.class, args);
	}

}
