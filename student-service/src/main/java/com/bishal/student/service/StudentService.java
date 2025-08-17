package com.bishal.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bishal.student.entity.Student;
import com.bishal.student.repo.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public Student getStudent(Long id) {
		
		return studentRepository.findById(id).get();
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
