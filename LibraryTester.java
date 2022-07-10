 import java.util.Scanner;

class LibraryTester{

   public static void main(String a[]){
	    
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of book");
	 int size = sc.nextInt();
	 
	 Library lb = new Library(size);
	 
	 for(int i=0; i<size;i++){
		 
    BooksDTO book = new BooksDTO();
	
	System.out.println("Enter the book id ");
	int id = sc.nextInt();
	
	System.out.println("Enter the book name");
	String name = sc.next();
	
	System.out.println("Enter the book type");
	String type = sc.next();
	
	System.out.println("Enter the book author");
	String author = sc.next();
   
   book.setId(id);
   book.setName(name);
   book.setType(type);
   book.setAuthor(author);
   lb.createTypesOfBooks(book);
   }
   lb.getBookDetails();


   }

   













}