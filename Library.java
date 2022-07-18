import java.util.Arrays;


   class Library{

     BooksDTO[] books;

     int index;
 
	 public Library(int size)
    {
		books = new BooksDTO[size];

	  System.out.println("Library constructor is called");   
    }
   
     public boolean createTypesOfBooks(BooksDTO book){
	  System.out.println("inside the create Types Of Books");
    	  
	  boolean isAdded = false;
      if(book !=null && book.getName() !=null){
		  this.books[index++] = book;
		  isAdded = true;
		  System.out.println("The book detailed is saved");
		  
		  
	   }	  
	    else
		{
		  System.out.println("The required book is not here");
	       }	 
		 
		 return isAdded;
	}

      public void getBookDetails(){
		System.out.println("inside getBookDetails");
        for(int i=0; i<books.length;i++){
			
		System.out.println("The book id is " +books[i].getId()+" \n The book name is "+books[i].getName()+" \n The type of book "+books[i].getType()+"\n The author of the book "+books[i].getAuthor());	
		}		
		  
	 }


    public boolean updateBookAuthorById(int id , String author){
		System.out.println("inside the updateBookAuthorById");
		
		boolean updateAuthor = false;
		
		for(int i=0; i<books.length;i++){
		if(books[i].getId() == id){	
		 books[i].setAuthor(author);
		 updateAuthor= true;
		 
		}
		  else{
			  System.out.println("please enter the correct id");
		  }
		  
		  }
	         return updateAuthor;
		}	
		
			
				public boolean deleteBooksDetailsByName(String name){
					boolean booksDeleted = false;
					System.out.println("inside deleteBooksDetailsByNamess");
					int i,j;
					for (i=0 ,j=0 ; j<books.length;j++){
						
					    if(!books[j].getName().equals(name)){
							books[i++]=books[j];
							booksDeleted=true;
							
					    }
						else{
							System.out.println("the books is not find");
						}
					}
					
					books= Arrays.copyOf(books,i);

					return booksDeleted;
				}
				
				 public String getBookNameById(int id){
		 System.out.println("Inside getBookNameById() ");
		 String bookName = null;
		 for(int i=0; i<books.length;i++){
			 if(books[i].getId()==id){
				 bookName = books[i].getName();
			 }
			 else{
				 System.out.println("The id is not matched");
			 }
		 }
		 return bookName;
	 }
	 
	 public String[] getAllBooksName(){
		 System.out.println("Inside getAllBooksName() ");
		 int i,j;
		 for( j=0,i=0;i<books.length;i++){ 
			  System.out.println(books[i].getName());
			  j++;
		 }
		    
		  String[] allbooksName = new String[j];
		   for(int k=0,m=0;k<books.length;k++){
			 allbooksName[m++] = books[k].getName(); 
		  }
           System.out.println("End getAllBooksName() ");
		 return allbooksName;
	 }
	 


}