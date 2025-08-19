package com.bishal.book.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.bishal.book.dto.BookResponse;
import com.bishal.book.entity.Book;
import com.bishal.book.repo.BookRepo;

@Service
public class BookService {

	private final BookRepo bookRepo;
	private final ModelMapper modelMapper;
	
	public BookService(BookRepo bookRepo, ModelMapper modelMapper) {
		this.bookRepo = bookRepo;
		this.modelMapper = modelMapper;
	}

	public List<BookResponse> getBooksByStudentId(Long id) {
		List<Book> books = bookRepo.findBooksByStudentId(id);
		List<BookResponse> BookList = (List<BookResponse>) modelMapper.map(books, BookResponse.class);
		return null;
	}

}
