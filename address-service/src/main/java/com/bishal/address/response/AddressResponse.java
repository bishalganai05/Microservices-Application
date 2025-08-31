package com.bishal.address.response;

import com.bishal.address.entity.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
	public AddressResponse(Address address){
		this.addressId = address.getAddressId();
		this.houseNumber = address.getHouseNumber();
		this.street = address.getStreet();
		this.city = address.getCity();
		this.state = address.getState();
		this.pinCode = address.getPinCode();
	}
	
	private long addressId;
	private String houseNumber;
	private String street;
	private String city;
	private String state;
	private String pinCode;
}
