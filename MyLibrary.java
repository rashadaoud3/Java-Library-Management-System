package AssignmentTwo;
import java.util.*;
public class MyLibrary {

	public static void main(String[] args) {
		LibraryCatalog Library=new LibraryCatalog();
		Scanner read=new Scanner(System.in);

		
		System.out.println("Enter the name of the book : ");
		String title=read.nextLine();
		System.out.println("Enter the author of the book : ");
		String author=read.nextLine();
		System.out.println("Enter the number of copies : ");
		int copies=read.nextInt();
		System.out.println("Enter copyright : ");
		int copyright=read.nextInt();
		Library=new LibraryCatalog(title, author, copies, copyright);
		
		
		
		int num;
		
		System.out.println("Enter a number from 1 to 6 for the following options ");
		System.out.println("Press ~1~ to Add a book to the library catalog");
		System.out.println("Press ~2~ to Search a Book");
		System.out.println("Press ~3~ to Borrow a Book");
		System.out.println("Press ~4~ to Return a Book");
		System.out.println("Press ~5~ to List all the book titles in the Library Catalog");
		System.out.println("Press ~6~ to Quit ");
		num=read.nextInt();
		while(num!=6) {
			if(num==1) {
				//String title;
				System.out.println("Enter the title the book : ");
				title=read.nextLine();
				
				if(Library.searchBook(title)!=-1) {
					System.out.println("How many extra copies would you llike to add : ");
					int extraCopies=read.nextInt();
					Library.add_copies(title,+extraCopies);
					
				}
				else {
					System.out.println("How many extra copies would you llike to add : ");
					int extraCopies=read.nextInt();
					Library.addNewBook(Library.ANewBook, extraCopies);
				}
				
				
			}
			else if(num==2) {
				System.out.println("Enter the name of the book : ");
				String Tiitle=read.nextLine();
				if(Library.searchBook(Tiitle)!=-1) {
					int index=Library.searchBook(Tiitle);
					System.out.println("Book Name : "+Library.ANewBook[index].getTitle()+" ,Author : "+Library.ANewBook[index].getAuther()
							+ " ,copyright : "+Library.ANewBook[index].getCopyright()+" ,copies : "+Library.ANewBook[index].getCopies());
				}
				else {
					System.out.println("Sorry, this book was not found");
				}
				
			}
			else if(num==3) {
				System.out.println("Enter the name of the book : ");
				String Tiitle=read.nextLine();
				if(Library.borrowBook(Tiitle)) {
					Library.borrowBook(Tiitle);
					System.out.println("The book has been successfully loaned to you!\r\n"
							+ "And you must return it within 10 days");
				}
				else {
					System.out.println("The book is not available in the library!");
				}
				
			}
			else if(num==4) {
				System.out.println("Enter the name of the book : ");
				String Tiitle=read.nextLine();
				if(Library.returnBook(Tiitle)) {
					Library.returnBook(Tiitle);
					System.out.println("The book returned successfully");
					
				}
				else {
					System.out.println("A book with the entered title has not been found in the library!");
					System.out.println("Please search again!");
				}
				
			}
			else if(num==5) {
				Library.list_title();
			}
			else {
				
			}
			
			System.out.println("Enter a number from 1 to 6 for the following options ");
			System.out.println("Press ~1~ to Add a book to the library catalog");
			System.out.println("Press ~2~ to Search a Book");
			System.out.println("Press ~3~ to Borrow a Book");
			System.out.println("Press ~4~ to Return a Book");
			System.out.println("Press ~5~ to List all the book titles in the Library Catalog");
			System.out.println("Press ~6~ to Quit ");
			num=read.nextInt();	
		}
	}
	
}