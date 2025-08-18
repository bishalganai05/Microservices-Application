package com.bishal.student.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bishal.student.dto.StudentResponse;
import com.bishal.student.entity.Student;
import com.bishal.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	private final StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping
	List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	ResponseEntity<StudentResponse> getStudent(@PathVariable Long id) {
		StudentResponse studentResponse = studentService.getStudent(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(studentResponse);
	}
}
