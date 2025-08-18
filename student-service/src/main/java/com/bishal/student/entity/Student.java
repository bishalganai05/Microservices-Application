package com.bishal.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table_gen")
//    @TableGenerator(
//        name = "table_gen",
//        initialValue = 100000,
//        allocationSize = 1
//    )
	@Column(name = "studentId")
	private Long studentId; 
	
	@Column(name = "studentName")
	private String studentName; 
	
	@Column(name = "studentEmail")
	private String studentEmail;
	
	@Column(name = "studentMobileNumber")
	private String studentMobileNumber;
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(String studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public Student(Long studentId, String studentName, String studentEmail, String studentMobileNumber) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMobileNumber = studentMobileNumber;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentMobileNumber=" + studentMobileNumber + "]";
	}
	
	
}
