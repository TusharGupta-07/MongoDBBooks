package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.request.CreateRequest;

@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	@GetMapping("/getBooks")
	public List<Book> getBooks()
	{
		return bookRepository.findAll();
	}

	@PostMapping("/insertBook")
	public void insertBook(@RequestBody CreateRequest createRequest)
	{
		Book b=new Book(createRequest.getName(), createRequest.getCost(),createRequest.getAuthorName(), createRequest.getCount());
		bookRepository.save(b);
	}
	
	@GetMapping("/getBookByAuthor/{name}")
	public List<Book> getBookByAutor(@PathVariable(value="name") String name){
		return bookRepository.findByAuthorName(name);
		
	}
}
