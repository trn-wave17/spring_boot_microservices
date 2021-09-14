package com.ibm.training.music.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MusicInfoCrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicInfoCrudServiceApplication.class, args);
	}

}
