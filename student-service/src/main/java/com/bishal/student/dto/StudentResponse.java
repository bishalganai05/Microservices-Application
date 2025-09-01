package com.bishal.student.dto;

import com.bishal.student.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
	public StudentResponse(Student student) {
		this.studentId = student.getStudentId();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		this.emailId = student.getEmailId();
		this.phoneNumber = student.getPhoneNumber();
	}
	private long studentId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNumber;
	private long addressId; 
}
