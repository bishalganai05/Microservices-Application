package com.bishal.student.service;

import org.springframework.stereotype.Service;

import com.bishal.student.dto.StudentRequest;
import com.bishal.student.dto.StudentResponse;
import com.bishal.student.entity.Student;
import com.bishal.student.repository.StudentRepository;

@Service
public class StudentService {
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public StudentResponse createStudent(StudentRequest studentRequest) {
		Student student = new Student();
		student.setFirstName(studentRequest.getFirstName());
		student.setLastName(studentRequest.getLastName());
		student.setEmailId(studentRequest.getEmailId());
		student.setPhoneNumber(studentRequest.getPhoneNumber());
		student.setAddressId(studentRequest.getAddressId());
		
		Student newStudent = studentRepository.save(student);
		
		return new StudentResponse(newStudent); 
	}
	
	public StudentResponse getStudentById(long id) {
		return new StudentResponse(studentRepository.findById(id).get());
	}
}
