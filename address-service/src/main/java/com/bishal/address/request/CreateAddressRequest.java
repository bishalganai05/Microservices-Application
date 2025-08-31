package com.bishal.address.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAddressRequest {
	private String houseNumber;
	private String street;
	private String city;
	private String state;
	private String pinCode;
}
