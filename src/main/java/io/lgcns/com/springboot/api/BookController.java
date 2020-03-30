package io.lgcns.com.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.lgcns.com.springboot.domain.Book;
import io.lgcns.com.springboot.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/{bookId}")
	public ResponseEntity<Book> findById(@PathVariable Long bookId) {
		Book book = bookService.findByid(bookId).orElseThrow( () -> new RuntimeException("Not Found: " + bookId) );
		return ResponseEntity.ok(book);
	}

}
