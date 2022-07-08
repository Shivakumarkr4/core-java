class Library{

     BooksDTO[] books = new BooksDTO[1];

     int index;
 
	 public Library()
    {
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

}