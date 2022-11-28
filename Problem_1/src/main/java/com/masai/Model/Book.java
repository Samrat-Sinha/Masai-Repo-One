package com.masai.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	private String bookName;
	private String bookAuthor;
	private String bookPublication;
	private String bookCategory;
	private Integer bookPages;
	private Integer bookPrice;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookId, String bookName, String bookAuthor, String bookPublication, String bookCategory,
			Integer bookPages, Integer bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublication = bookPublication;
		this.bookCategory = bookCategory;
		this.bookPages = bookPages;
		this.bookPrice = bookPrice;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublication() {
		return bookPublication;
	}

	public void setBookPublication(String bookPublication) {
		this.bookPublication = bookPublication;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public Integer getBookPages() {
		return bookPages;
	}

	public void setBookPages(Integer bookPages) {
		this.bookPages = bookPages;
	}

	public Integer getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublication="
				+ bookPublication + ", bookCategory=" + bookCategory + ", bookPages=" + bookPages + ", bookPrice="
				+ bookPrice + "]";
	}

	
	
	
	
}
