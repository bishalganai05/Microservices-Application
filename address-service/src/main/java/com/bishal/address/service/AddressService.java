package com.bishal.address.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bishal.address.entity.Address;
import com.bishal.address.repository.AddressRespository;
import com.bishal.address.request.CreateAddressRequest;
import com.bishal.address.response.AddressResponse;

@Service
public class AddressService {
	private static final Logger logger = LoggerFactory.getLogger(AddressService.class);
	
	private final AddressRespository addressRespository;
	
	public AddressService(AddressRespository addressRespository) {
		this.addressRespository = addressRespository;
	}

	public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
		Address address = new Address();
		address.setHouseNumber(createAddressRequest.getHouseNumber());
		address.setCity(createAddressRequest.getCity());
		address.setStreet(createAddressRequest.getStreet());
		address.setState(createAddressRequest.getState());
		address.setPinCode(createAddressRequest.getPinCode());
		
		addressRespository.save(address);
		
		return new AddressResponse(address);
		
	}

	public AddressResponse getById(long id) {
		logger.info("Inside getId "+ id);
		
		Address address = addressRespository.findById(id).get();
		return new AddressResponse(address); 
	}
}
