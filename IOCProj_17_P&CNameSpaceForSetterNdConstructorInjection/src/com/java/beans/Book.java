package com.java.beans;

import java.util.Date;

public class Book {

	private String bookName;
	private String author;
	private float price;
	private Date publishedDate;
	
	public Book() {
		System.out.println("Book.  0-param constructor...!");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		System.out.println("Book.setBookName()");
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		System.out.println("Book.setAuthor()");
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		System.out.println("Book.setPrice()");
		this.price = price;
	}

	public void setPublishedDate(Date publishedDate) {
		System.out.println("Book.setPublishedDate()");
		this.publishedDate = publishedDate;
	}
	
	public Date getPublishedDate() {
		return publishedDate;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", price=" + price + ", publishedDate="
				+ publishedDate + "]";
	}
	
}
