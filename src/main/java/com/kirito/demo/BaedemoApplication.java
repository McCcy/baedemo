package com.kirito.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCaching
public class BaedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaedemoApplication.class, args);
	}
}
