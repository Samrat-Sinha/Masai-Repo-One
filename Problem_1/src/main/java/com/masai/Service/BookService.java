package com.masai.Service;

import java.util.List;

import com.masai.Model.Book;

public interface BookService {

	public List<Book> getAllBook();
	
	public Book getBookById(int bookId);
	
	public Book createBook(Book book);
	
	public Book deleteBook(int bookId);
	
	public Book updatedBook(Book book);
	
}
