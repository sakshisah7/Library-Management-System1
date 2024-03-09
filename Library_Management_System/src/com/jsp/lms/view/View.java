package com.jsp.lms.view;

import java.util.Scanner;

import com.jsp.lmc.controller.Controller;
import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;

public class View {
	static private Library library = new Library();
	static Controller controller = new Controller();

	public static Library getLibrary() {
		return library;
	}

	public static void setLibrary(Library library) {
		View.library = library;
	}

	static Scanner myInput = new Scanner(System.in);

	static {
		System.out.println("-------Welcome to LMS-------");
		System.out.print("Enter the Library name : ");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		System.out.print("Enterthe address of library : ");
		library.setLibraryaddress(myInput.nextLine());
		System.out.print("Enter the pincode : ");
		library.setPincode(myInput.nextInt());
		myInput.nextLine();
	}

	public static void main(String[] args) {
do {
	System.out.println("Select option to Perform .");
	System.out.println("1.Add Book\n2.Remove Book\n3.Upadte Book\n4.Get Book\n0.Exit");
	System.out.println("Enter Desire Option");
	byte UserChoice = myInput.nextByte();
	myInput.nextLine();
	switch (UserChoice) {
	case 0:
		myInput.close();
		System.out.print("-------------------E-X-I-T-E-D-----------------");
		System.exit(0);
		break;
		
	case 1:
		Book book = new Book();
		System.out.print("Enter book name :");
		book.setBooksName(myInput.nextLine());
		System.out.print("Anter Author Name :");
		book.setAuthorName(myInput.nextLine());
		System.out.print("Enter the Price of Book :");
		book.setPrice(myInput.nextDouble());
		controller.addbook(book);
		System.out.println("sucessfully Added");
		myInput.nextLine();
		
		break;
	case 2:
		System.out.print("enter book name to be removed :");
		String bookToRemove = myInput.nextLine();
		if(controller.removeBook(bookToRemove)) {
			System.out.println("Book Deleted");
		}else {
			System.out.println("Book does not exit");
		}
	
		break;
	case 3:
		System.out.println("Enetr book name to update");
		Book bookExist = controller.getBook(myInput.nextLine());
		if(bookExist!=null) {
			Book booktoUpdate = bookExist;
			System.out.println("what to update");
			System.out.println("1.Book Name \n2.Author Name \n3.Price");
			System.out.println("Enter the respective digit");
			byte updateChoice = myInput.nextByte();
			myInput.nextLine();
			switch (updateChoice) {
			case 1:
				System.out.println("enter Book name to update");
				booktoUpdate.setBooksName(myInput.nextLine());
				break;
			case 2:
				System.out.println("Enetr author name to update");
				booktoUpdate.setAuthorName(myInput.nextLine());
				break;
			case 3:
				System.out.println("Enter book price to Update");
				double newBookPrice = myInput.nextDouble();
				booktoUpdate.setPrice(newBookPrice);
	
				break;
			
			default:
				System.out.println("-------------INVALID SELECTION-----------------------");
				break;
			}
		}
	
		break;
	case 4:
		System.out.println("Enter Book of your choice : ");
		Book fetchbook = controller.getBook(myInput.nextLine());
		if(fetchbook!=null) {
			System.out.println("Book is aviable :");
			System.out.println("Detatils");
			System.out.println(fetchbook);
		}else {
			System.out.println("Book is not avialble");
		}
	
		break;

	default:
		System.out.println("Invalid Input");
		break;
	}
} while (true);
	}

}
