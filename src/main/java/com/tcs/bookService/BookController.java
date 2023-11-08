package com.tcs.bookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.authorService.Author;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping("/{id}")
	public Author getAuthorById(@PathVariable("id") Long id) {
		return bookService.getAuthorById(id);
	}

	@GetMapping
	public String test() {
		return "test";
	}
}
