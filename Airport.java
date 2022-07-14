class Airport{

  TerminalDTO[] terminal;
   int index;

    public Airport(int size){
	terminal = new TerminalDTO[size];
	 System.out.println("Airport constructor is called");
	  
    }   

     public boolean createTerminal(TerminalDTO terminal){
	   System.out.println("Inside the create types of terminal"); 
	   
	   boolean isAdded = false;
	   if(terminal != null && terminal.getId() != 0){
		   this.terminal[index++] = terminal;
		   isAdded = true;
		   System.out.println("The terminal detail is added");
		   
		  }
		  
		  else{
			  System.out.println("The required terminal is not here");
		  }
	     
		 return isAdded;
	   
	   }

      public void getTerminalDetails()
	  {
		 System.out.println("inside getTerminalDetails"); 
		  
		  for(int i=0; i<terminal.length;i++)
		  {
		  System.out.println("The terminal id is "+terminal[i].getId()+" \n The total terminal is  "+terminal[i].getArea()+" \n The get NoOfLoadingBridges "+terminal[i].getNoOfLoadingBridges()+" \n The getNoOfDepartureGates is "+terminal[i].getNoOfDepartureGates()+" \n The getNoOfCheckInCounter "+terminal[i].getNoOfCheckInCounter());	  
	     }
		  
		  
	 }
		
		public boolean updateTerminalNoOfDepartureGatesById(int id, int noOfDepartureGates){
			
			System.out.println("inside updateTerminalNoOfDepartureGatesById()");
		
			boolean updateNoOfDepartureGates = false;
			for(int i=0; i<terminal.length;i++){
				if(terminal[i].getId() == id){
				terminal[i].setNoOfDepartureGates(id);
					updateNoOfDepartureGates = true;
					
			    }
				
				else{
					System.out.println("please update the NoOfDepartureGates first");
				 }
				 
			}
			
		     return updateNoOfDepartureGates;
		}




}