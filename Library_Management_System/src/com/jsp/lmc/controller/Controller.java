package com.jsp.lmc.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;
import com.jsp.lms.view.View;

public class Controller {
	private Library library = View.getLibrary();

	public void addbook(Book book) {
		List<Book> books = library.getBooks();
		if (books == null) {
			books = new ArrayList<Book>();

		}
		books.add(book);
		library.setBooks(books);
	}

	public boolean removeBook(String bookName) {
		Book book = getBook(bookName);
		if (book != null) {
			List<Book> books = library.getBooks();
			boolean remove = books.remove(book);
			library.setBooks(books);
			return true;
		}
		return false;
	}
	
	public boolean update(Book bookExist, Book booktoUpdate) {
		List<Book> books = library.getBooks();
		for (Book book : books) {
			if(book.getBooksName().equalsIgnoreCase(bookExist.getBooksName())) {
				books.remove(bookExist);
				books.add(booktoUpdate);
				library.setBooks(books);;
				return true;
			}
		}
		return false;
	}

	public Book getBook(String bookName) {
		List<Book> books = library.getBooks();
		if (books != null) {
			for (Book book : books) {
				if (book.getBooksName().equalsIgnoreCase(bookName)) {
					return book;
				}
			}
		}
		return null;
	}

}
