package com.rms.ResourceManagementAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication(scanBasePackages = { "com.rms.ResourceManagementAPI.controller","com.rms.ResourceManagementAPI.dao","com.rms.ResourceManagementAPI.model","com.rms.ResourceManagementAPI.Service"})

public class ResourceManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceManagementApiApplication.class, args);
	}

}
