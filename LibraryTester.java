class LibraryTester{

   public static void main(String a[]){
   
   Library lb = new Library();
   
   BooksDTO book = new BooksDTO();
   
   book.setId(456);
   book.setName("Ramayana");
   book.setType("Epic");
   book.setAuthor("Valmiki");
   lb.createTypesOfBooks(book);
   lb.getBookDetails();


   }
















}