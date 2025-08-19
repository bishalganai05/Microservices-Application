package com.bishal.book.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bishal.book.dto.BookResponse;
import com.bishal.book.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/{id}")
	ResponseEntity<List<BookResponse>> getBooksByStudentId(@PathVariable Long id){
		List<BookResponse>  bookResponse = bookService.getBooksByStudentId(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(bookResponse);
	}
}
