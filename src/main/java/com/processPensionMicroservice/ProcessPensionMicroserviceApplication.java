package com.processPensionMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SuppressWarnings("unused")
@SpringBootApplication
@EnableFeignClients
public class ProcessPensionMicroserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProcessPensionMicroserviceApplication.class, args);
	}
}
