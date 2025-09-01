package com.bishal.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bishal.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
