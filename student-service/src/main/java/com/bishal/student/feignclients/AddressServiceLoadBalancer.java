package com.bishal.student.feignclients;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(value = "address-service")
public class AddressServiceLoadBalancer {

	@LoadBalanced
    @Bean
    Feign.Builder feignBuilder(){
		return Feign.builder();
	}
}
