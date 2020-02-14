package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaFeignLoadBalancerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaFeignLoadBalancerProviderApplication.class, args);
	}

}
