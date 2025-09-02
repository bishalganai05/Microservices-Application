package com.bishal.student.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class StudentConfiguration {
	
	@Value("${address.service.url}")
	private String addressServiceURL;

    @Bean
    WebClient webClient() {
		WebClient webClient = WebClient.builder()
									   .baseUrl(addressServiceURL)
									   .build();
		
		return webClient;
	}
}
