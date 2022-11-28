package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.Book;
import com.masai.Repositary.BookRepo;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo bRepo;
	

	@Override
	public List<Book> getAllBook() {
		List<Book> books = bRepo.findAll();
		
		return books;
		
	}

	@Override
	public Book getBookById(int bookId) {
	      Optional<Book> opt=bRepo.findById(bookId);
	      Book book = opt.get();
	      return book;
	      
	}

	@Override
	public Book createBook(Book book) {
		Book saveBook = bRepo.save(book);
		return saveBook;
	}

	@Override
	public Book deleteBook(int bookId) {
		Optional<Book> opt=bRepo.findById(bookId);
	      Book book = opt.get();
	      bRepo.delete(book);
	      return book;
	}

	@Override
	public Book updatedBook(Book book) {
		Optional<Book> opt=bRepo.findById(book.getBookId());
	      Book updatedBook = bRepo.save(book);
	      return updatedBook;
	}

}
