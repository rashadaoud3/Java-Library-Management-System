package AssignmentTwo;
import java.util.*;
public class LibraryCatalog {
	
	int numberOfBOok=0;
	Scanner read=new Scanner(System.in);
	/*private*/ BookIndex[] ANewBook=new BookIndex[50];
	
	/*private*/ int extraCopies;
	
	
	
	public LibraryCatalog(String title,String author,int copies,int copyRight) {
		ANewBook[numberOfBOok]=new BookIndex(title, author, copies, copyRight);
		numberOfBOok++;
	}
	public LibraryCatalog() {
		
	}
	
	public void addNewBook(BookIndex b) {
		String title;
		System.out.println("Enter the name of the book : ");
		title=read.nextLine();
		int flag=0;
		int index=0;
		for(int i=0;i<numberOfBOok;i++) {
			if(title==ANewBook[i].getTitle()) 
			{
				flag=1;
				index=i;
			}
		}
		if(flag==1) {
			System.out.println("This Book is already exist at index "+index);
		}
		else
		{
			numberOfBOok+=1;
			ANewBook[numberOfBOok-1].setTitle(title);
			System.out.println("Enter Auther's Name:  ");
			ANewBook[numberOfBOok-1].setAuther(read.nextLine());
			System.out.println("Enter number of copies : ");
			ANewBook[numberOfBOok-1].setCopies(0);
			System.out.println("Enter year of published : ");
			ANewBook[numberOfBOok-1].setCopyright(read.nextInt());
		}
		ANewBook[numberOfBOok-1]=new BookIndex(b.getTitle(),b.getAuther(),0,b.getCopyright()); 
		//numberOfBOok+=1;
	}
	
	public void addNewBook(BookIndex []b,int ncopies) {
		String title;
		System.out.println("Enter the name of the book : ");
		title=read.nextLine();
		for(int i=0;i<numberOfBOok;i++) {
			if(title==ANewBook[i].getTitle()) {
				System.out.println("How many extra copies would you llike to add : ");
				extraCopies=read.nextInt();
				ANewBook[i].setCopyright(+extraCopies);     // ~~check~~
			
			}
			else {
				numberOfBOok+=1;
				ANewBook[numberOfBOok-1].setTitle(title);
				System.out.println("Enter Auther's Name:  ");
				ANewBook[numberOfBOok-1].setAuther(read.nextLine());
				System.out.println("Enter number of copies : ");
				ANewBook[numberOfBOok-1].setCopies(ncopies);
				System.out.println("Enter year of published : ");
				ANewBook[numberOfBOok-1].setCopyright(read.nextInt());
			}
	}
	}
	
	public boolean add_copies(String title,int quantity) {//quantity the same as extra copies    ~~check~~
		int flag=0;
		for(int i=0;i<numberOfBOok;i++) {
			if(title==ANewBook[i].getTitle()) {
				flag=1;
				ANewBook[i].setCopyright(+quantity); 
			}
		}
	if(flag==1) {
		return true;
	}
	else
	{
		return false;
	}
	
	}
	
	
	
	// TO find the number of copies
	public int findInCatalog(String title) {
		int NumOfCopies=0;
		for(int i=0;i<numberOfBOok;i++) {
			if(title==ANewBook[i].getTitle()) {
				NumOfCopies=ANewBook[i].getCopies();
			}
		}
		return NumOfCopies;
	}
	
	//return the index of title that is exist 
	public int searchBook(String title) {
		int index = 0,flag=0;
		for(int i=0;i<numberOfBOok;i++) {
			if(title==ANewBook[i].getTitle()){
				index=i;
				flag=1;
			}
		}
		if(flag==1)
		{
			return index;
		}
		else
			return -1;
	}
	
	
	// print all books with their information
	public void list_title() {
		for(int i=0;i<numberOfBOok;i++) {
			System.out.println("Book Name : "+ANewBook[i].getTitle()+" ,Auther : "+ANewBook[i].getAuther()
					+ " ,copyright : "+ANewBook[i].getCopyright()+" ,copies : "+ANewBook[i].getCopies());
			System.out.println("");
		}
	}
	// return true if we can borrow a book+ (-1) and false if number of copies=0 ~~
	public boolean borrowBook(String title) {
		int flag=0;
		for(int i=0;i<numberOfBOok;i++) {
			if(title==ANewBook[i].getTitle()) {
				if(ANewBook[i].getCopies()>0) {
					int n=ANewBook[i].getCopies();
					n--;
					ANewBook[i].setCopies(n);
					flag=1;
					System.out.println("Book Name : "+ANewBook[i].getTitle()+" ,Auther : "+ANewBook[i].getAuther()+ 
							" ,copyright : "+ANewBook[i].getCopyright()+" ,copies : "+ANewBook[i].getCopies());

				}
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	//return true if the book found+ (+1)
	public boolean returnBook(String title) {
		int flag=0;
		for(int i=0;i<numberOfBOok;i++) {
			if(title==ANewBook[i].getTitle()) {
				ANewBook[i].setCopies(ANewBook[i].getCopies()+1);
				flag=1;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	
	
	 
	
	
}
	
	
	
	
	
	


