package com.bishal.student.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bishal.student.dto.AddressResponse;

@FeignClient(value = "address-service",path = "/api/address")
public interface AddressFeignClient {
	@GetMapping("{id}")
	public AddressResponse getAddressById(@PathVariable long id);
}
