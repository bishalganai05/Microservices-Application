package com.bishal.student.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.bishal.student.dto.AddressResponse;
import com.bishal.student.dto.StudentRequest;
import com.bishal.student.dto.StudentResponse;
import com.bishal.student.entity.Student;
import com.bishal.student.repository.StudentRepository;

import reactor.core.publisher.Mono;

@Service
public class StudentService {
	private final StudentRepository studentRepository;
	private final WebClient webClient;

	public StudentService(StudentRepository studentRepository, WebClient webClient) {
		this.studentRepository = studentRepository;
		this.webClient = webClient;
	}
	
	public StudentResponse createStudent(StudentRequest studentRequest) {
		Student student = new Student();
		student.setFirstName(studentRequest.getFirstName());
		student.setLastName(studentRequest.getLastName());
		student.setEmailId(studentRequest.getEmailId());
		student.setPhoneNumber(studentRequest.getPhoneNumber());
		student.setAddressId(studentRequest.getAddressId());
		
		Student newStudent = studentRepository.save(student);
		
		StudentResponse studentResponse = new StudentResponse(newStudent);
		studentResponse.setAddressResponse(getAddressById(newStudent.getAddressId()));
		
		return studentResponse; 
	}
	
	public StudentResponse getStudentById(long id) {
		Student student = studentRepository.findById(id).get();
		StudentResponse studentResponse = new StudentResponse(student);
		studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
		
		return studentResponse;
	}
	
	public AddressResponse getAddressById(long addressId) {
	Mono<AddressResponse> addressResponse = webClient.get()
													 .uri("/"+addressId)
													 .retrieve()
													 .bodyToMono(AddressResponse.class);
	
		return addressResponse.block();
	}
}
