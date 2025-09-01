package com.bishal.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNumber;
	private long addressId; 
}
