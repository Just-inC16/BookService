package com.tcs.bookService;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String ISBN;
	private Long authorId; // Instead of the whole author object, we're storing authorId
	@Enumerated(EnumType.STRING)
	private BookStatus status;
}
