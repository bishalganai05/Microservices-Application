package com.bishal.student.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bishal.student.dto.StudentRequest;
import com.bishal.student.dto.StudentResponse;
import com.bishal.student.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("{id}")
	public StudentResponse getStudentById(@PathVariable long id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/create")
	public StudentResponse createStudent(@RequestBody StudentRequest studentRequest) {
		return studentService.createStudent(studentRequest);
	}
}
