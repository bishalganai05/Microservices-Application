package com.bishal.address.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bishal.address.request.CreateAddressRequest;
import com.bishal.address.response.AddressResponse;
import com.bishal.address.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {
	private final AddressService addressService;

	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}
	
	@PostMapping("/create")
	public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest) {
		return addressService.createAddress(createAddressRequest);
	}
	
	@GetMapping("{id}")
	public AddressResponse getAddressById(@PathVariable long id) {
		return addressService.getById(id);
	}
}
