package com.bishal.student.service;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bishal.student.dto.BookResponse;
import com.bishal.student.dto.StudentResponse;
import com.bishal.student.entity.Student;
import com.bishal.student.repo.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository studentRepository;
	private final ModelMapper modelMapper;
	private final RestTemplate restTemplate;
	
	public StudentService(StudentRepository studentRepository, ModelMapper modelMapper, RestTemplate restTemplate) {
		this.studentRepository = studentRepository;
		this.modelMapper = modelMapper;
		this.restTemplate = restTemplate;
	}

	public StudentResponse getStudent(Long id) {
	    Student student = studentRepository.findById(id).get();
	    StudentResponse studentResponse = modelMapper.map(student, StudentResponse.class);

	    String url = "http://localhost:8081/book-service/api/books/{id}";
	    BookResponse[] bookResponses = restTemplate.getForObject(url, BookResponse[].class, id);
	    studentResponse.setBookResponses(Arrays.asList(bookResponses));  

	    return studentResponse;
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
