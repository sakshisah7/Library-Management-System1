package com.jsp.lms.model;

public class Book {
	private String BooksName;
	private String AuthorName;
	private double price;

	public String getBooksName() {
		return BooksName;
	}

	public void setBooksName(String booksName) {
		BooksName = booksName;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book Name= " + BooksName + "\n Author Name= " + AuthorName + ""
				+ ""
				+ "\n Price= " + price ;
	}
	

}
