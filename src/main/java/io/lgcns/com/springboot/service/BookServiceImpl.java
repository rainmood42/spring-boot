package io.lgcns.com.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.lgcns.com.springboot.domain.Book;
import io.lgcns.com.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	private final BookRepository bookRepository;
	
	
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@Override
	public Optional<Book> findByid(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

}
