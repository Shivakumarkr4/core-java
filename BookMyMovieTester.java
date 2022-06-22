class BookMyMovieTester{

public static void  main(String a[]){
	
String movies[] = {"om","gaalipata","A","Upendra","H20","Rakta Kanneru","Suryavamshi","Yajamana"};	
String snacks[] = {"popcorn","lays","sweetcorn","cooldrinks"};
 BookMyMovie bookMyShow = new BookMyMovie("Veeresh",200,movies , snacks , 150 );
 System.out.println("The theatre name is "+ bookMyShow.theatreName);
  bookMyShow.showTime(20, "Devi","om");
bookMyShow.buySnacks("cooldrinks" , 60);

System.out.println("===============================================================================================");

BookMyMovie bookMyShow1 = new BookMyMovie("prasan",300,movies, snacks , 250);
 System.out.println("The theatre name is "+ bookMyShow1.theatreName);
  bookMyShow1.showTime(12, "sagar","kgf");
bookMyShow1.buySnacks("popcorn",20);

System.out.println("================================================================================================");

BookMyMovie bookMyShow2 = new BookMyMovie("navarang",250,movies, snacks , 320);
 System.out.println("The theatre name is "+ bookMyShow2.theatreName);
  bookMyShow2.showTime(6, "Shamanth","777charlie");
bookMyShow2.buySnacks("Lays",12);


}




}