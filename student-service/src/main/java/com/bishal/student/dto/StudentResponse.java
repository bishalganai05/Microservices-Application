package com.bishal.student.dto;

import lombok.Data;

@Data
public class StudentResponse {
	private Long studentId; 
	private String studentName; 
	private String studentEmail;
	private String studentMobileNumber;
}
