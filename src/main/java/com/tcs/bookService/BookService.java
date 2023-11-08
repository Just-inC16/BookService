package com.tcs.bookService;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tcs.authorService.Author;

@Service
public class BookService {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public Author getAuthorById(Long authorId) {
		return restTemplate().getForObject("http://localhost:8082/authors/" + authorId, Author.class);
	}
}
