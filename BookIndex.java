package AssignmentTwo;

public class BookIndex {
	private String title;
	private String author;
	private int copies;//number of available copies
	private int copyright;//Release year
	
//	public BookIndex() {
//	}        // not from the orders inn the assignment 
	
	public BookIndex(String title,String author,int copies,int copyright) {
		this.title=title;
		this.author=author;
		this.copies=copies;
		this.copyright=copyright;
		
	}
	public String toString() {
		return "Book's Name: "+title+" ,Auther Name: "+author+" ,Number Of Copies : "+copies+" ,Release year is : "+copyright;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}                

	public String getAuther() {
		return author;
	}

	public void setAuther(String auther) {
		this.author = auther;
	}                 

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public int getCopyright() {
		return copyright;
	}

	public void setCopyright(int copyright) {
		this.copyright = copyright;
	}
	
	
	

}
