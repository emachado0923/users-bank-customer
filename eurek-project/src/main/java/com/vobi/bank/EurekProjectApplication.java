package com.vobi.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekProjectApplication.class, args);
	}

}
