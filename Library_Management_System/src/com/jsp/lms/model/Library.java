
package com.jsp.lms.model;

import java.util.List;

public class Library {
	private String LibraryName;
	private String Libraryaddress;
	private int pincode;
	private List<Book> books;

	public String getLibraryName() {
		return LibraryName;
	}
	public void setLibraryName(String libraryName) {
		LibraryName = libraryName;
	}
	public String getLibraryaddress() {
		return Libraryaddress;
	}
	public void setLibraryaddress(String libraryaddress) {
		Libraryaddress = libraryaddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
