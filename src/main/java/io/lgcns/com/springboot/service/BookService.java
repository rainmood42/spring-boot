package io.lgcns.com.springboot.service;

import java.util.Optional;

import io.lgcns.com.springboot.domain.Book;

public interface BookService {
	
	Optional<Book> findByid(Long id);

}
