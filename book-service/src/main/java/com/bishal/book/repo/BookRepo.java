package com.bishal.book.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bishal.book.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{
	
	@Query(nativeQuery = true, value = "SELECT book.book_id,book.book_name,book.issue_date,book.student_id FROM studentlibrarymanagement.book book join studentlibrarymanagement.student student on student.student_id = book.student_id where book.student_id=:studentId")
	List<Book> findBooksByStudentId(@Param("studentId") Long studentId);
}
