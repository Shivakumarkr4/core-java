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
		
		
		public boolean updateLoadingBridgeById(int id, int noOfLoadingBridges){
		 
		 System.out.println("Inside updateLoadingBridgeById ");
		 boolean updateNoOfLoadingBridge = false;
		 for(int i=0; i<terminals.length;i++){
			 if(terminals[i].getId() == id ){
				 terminals[i].setNoOfLoadingBridges(noOfLoadingBridges);
				 updateNoOfLoadingBridge = true;
				 
			 }
			 else{
				 System.out.println("The terminal id is not found");
			 }
		 }
		 return updateNoOfLoadingBridge;
	 }
	 
	 public boolean updateNoOfCheckInCoountersByName(String name, int noOfCheckIncounters){
		 
		 System.out.println("Inside updatePatientContactNoByName ");
		 boolean updateCheckInCounters = false;
		 for(int i=0; i<terminals.length;i++){
			 if(terminals[i].getName().equals(name)){
				 terminals[i].setNoOfCheckinCounters(noOfCheckIncounters);
				 updateCheckInCounters = true;
				 
			 }
			 else{
				 System.out.println("The terminal name is not found");
			 }
		 }
		 return updateCheckInCounters;
	 }
	 
	 public boolean deleteTerminalsByName(String name){
		 System.out.println("inside deleteTerminalsByName");
		 boolean terminalDeleted = false;
		 int i,j;
		 for(i=0,j=0; j<terminals.length;j++){
			 if(!terminals[j].getName().equals(name)){
				 terminals[i++]=terminals[j];
				 terminalDeleted=true;
			 }
			 else{
				 System.out.println("The terminal is not found");
			 }
		 }
		 terminals = Arrays.copyOf(terminals, i);
		 return terminalDeleted;
		 
	 }
	 
	 public boolean deleteTerminalsById(int id){
		 System.out.println("Inside deleteTerminalsById");
		 boolean terminalDeleted=false;
		 int i,j;
		 for(i=0,j=0;j<terminals.length;j++){
			 if(terminals[j].getId()!=id){
				 terminals[i++]=terminals[j];
				 terminalDeleted=true;
			 }
			 else{
				 System.out.println("the termial id not found");
			 }
		 }
		 terminals = Arrays.copyOf(terminals, i);
		 return terminalDeleted;
	 }
	 
	 public String[] getAllTerminalName(){
		 System.out.println("Inside getAllTerminalName()");
		 int i,j;
		 for( j=0,i=0;i<terminals.length;i++){ 
		     System.out.println(terminals[i].getName());
			  j++;
		 }
		    
		    String[] allTerminalNames = new String[j];
		  for(int k=0,m=0;k<terminals.length;k++){
			 allTerminalNames[m++] = terminals[k].getName(); 
		  }

		 return allTerminalNames;
	 }
	 
	 public String getTerminalNameById(int id){
		 System.out.println("Inside getTerminalNameById()");
		 String terminalName = null;
		 for(int i=0; i<terminals.length;i++){
			 if(terminals[i].getId()==id){
				 terminalName = terminals[i].getName();
			 }
			 else{
				 System.out.println("The Terminal id not matched");
			 }
			 
		 }
		 return terminalName;
	 }
	 




}