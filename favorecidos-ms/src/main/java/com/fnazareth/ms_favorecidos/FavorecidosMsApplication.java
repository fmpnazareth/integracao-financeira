package com.fnazareth.ms_favorecidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FavorecidosMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavorecidosMsApplication.class, args);
	}

}
