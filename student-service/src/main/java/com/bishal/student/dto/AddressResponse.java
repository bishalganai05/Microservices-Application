package com.bishal.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
	private long addressId;
	private String houseNumber;
	private String street;
	private String city;
	private String state;
	private String pinCode;
}
