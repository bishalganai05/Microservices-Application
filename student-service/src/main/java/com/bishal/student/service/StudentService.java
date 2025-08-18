package com.bishal.student.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.bishal.student.dto.StudentResponse;
import com.bishal.student.entity.Student;
import com.bishal.student.repo.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository studentRepository;
	private final ModelMapper modelMapper;
	
	public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
		this.studentRepository = studentRepository;
		this.modelMapper = modelMapper;
	}

	public StudentResponse getStudent(Long id) {
		
		 Student student = studentRepository.findById(id).get();
		 StudentResponse studentResponse = modelMapper.map(student, StudentResponse.class);
		 
		 return studentResponse;
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
