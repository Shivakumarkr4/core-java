class BookMyMovie{

  String movies[] = {"om","gaalipata","A","Upendra","H20","Rakta Kanneru","Suryavamshi","Yajamana"};
     
	 int noOfTickets;
	 String theatreName;
	 String movieName;
     static int ticketPrice = 600;
	 int totalNoOfTicket;

	 String snacks[];
	 int noOfSnacks;
     int snacksPrice = 40;
	 
	
	 
	 
	 public BookMyMovie(String theatreName , int noOfTickets , String movies[], String snacks[] , int noOfSnacks ){
		this.theatreName = theatreName;
		this.noOfTickets = noOfTickets;
		this.movieName = movieName;
		 this.snacks = snacks;
		 this.noOfSnacks = noOfSnacks;
		 System.out.println("BookMymovie object is created");
	 }
	 
	
	 
	 
	 
	 public int showTime(int noOfTickets ,String bookedBy, String movieName ){
	  
	  int totalTicketPrice = 0;
	  
	 System.out.println("inside showTime()........ ");
	 System.out.println("Arg 1 : no of Tickets "+ noOfTickets);
	 System.out.println("Arg 2 : Booked by "+ bookedBy);
	 System.out.println("Arg 3 : Movie name "+ movieName);
	 
	 for(int index =0; index<movies.length;index++){
	 
	 if(movieName == movies[index]){
	 
	 System.out.println("movie name matched");
	 
	 if(noOfTickets< totalNoOfTicket){
	 totalTicketPrice = noOfTickets*ticketPrice;
	 noOfTickets = totalNoOfTicket-noOfTickets;
	 System.out.println("For Movie : "+ movies +" No of Tickets are That are remaining : "+ totalNoOfTicket + " Total price is " + totalTicketPrice);
	 
	 }
	 
	 else{
	 System.out.println("Isht Ticket illa...");
	 }
	 
	 
	  }
	 
	 else{
	 
	 System.out.println("The movie is not available");
	 }
	 
	 
	 }
	 return totalTicketPrice;
	 
	 
	 }
	 

public int buySnacks(String snackName , int quantity){
    System.out.println("The snackTime method is started");
		
	     int totalSnacksPrice =0; 
		 System.out.println("inside buySnacks()........ ");
	 System.out.println("Arg 1 : The snack name is "+ snackName);
	 System.out.println("Arg 2 : The quantity of snack is "+ quantity);
	 
		 
	
	for(int i=0; i<snacks.length;i++)

	{
		if (snackName == snacks[i]){
		 System.out.println("the snack is matched");	
			if(quantity < noOfSnacks){
				
			totalSnacksPrice = snacksPrice*quantity;
			noOfSnacks = noOfSnacks - quantity;
			System.out.println("The snacks  name : "+ "The price of the snacks" + totalSnacksPrice + "The total list snacks in the shop "+ noOfSnacks);
			
			}
			else{
				System.out.println("astu snacks illa");
			}
			
		}
		
		
		else{
			System.out.println("The snack is not avaliable");
		}
		
	}
	return totalSnacksPrice;


}






}