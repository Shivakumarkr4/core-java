import java.util.Scanner;

 class AirportTester{

   public static void main(String a[]){
	    
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of terminal");
	 int size = sc.nextInt();
	 
	 Airport AP = new Airport(size);
	 
	 for(int i=0; i<size;i++){
		 
    TerminalDTO TD = new TerminalDTO();
	
	System.out.println("Enter the terminal id ");
	int id = sc.nextInt();
	
	System.out.println("Enter the terminal area");
	String area = sc.next();
	
	System.out.println("Enter the terminal noOfLoadingBridges");
	int noOfLoadingBridges = sc.nextInt();
	
	System.out.println("Enter the terminal noOfDepartureGates ");
	int noOfDepartureGates = sc.nextInt();
	
	System.out.println("Enter the terminal noOfCheckInCounter");
	int noOfCheckInCounter = sc.nextInt();
   
   TD.setId(id);
   TD.setArea(area);
   TD.setNoOfLoadingBridges(noOfLoadingBridges);
   TD.setNoOfDepartureGates(noOfDepartureGates);
   TD.setNoOfCheckInCounters(noOfCheckInCounter);
   AP.createTerminal(TD);
   }
   
    String options = null;
		 do{
		     System.out.println("Enter 1 to fetch the all terminal details");
			 System.out.println("Enter 2 to update Loading bridge by id");
			 System.out.println("Enter 3 to update No Of checkin counter by name ");
			 System.out.println("enter 4 to delete the terminals by name");
			 System.out.println("enter 5 to delete the terminals by id");
			 System.out.println("Enter 6 to get all terminal names");
			 System.out.println("Enter 7 to get the get terminal name by id");
			 
			 System.out.println("enter the choice");
			 int choice = sc.nextInt();
			 
			 switch(choice){
				    
					case 1 : AP.getTerminalDetails();
					          break ;
							  
					case 2 : System.out.println("Enter the existing id to update the loading bridges");
		                     int existingId = sc.nextInt();
		                     System.out.println("Enter no of loading bridges to be update");
		                     int updateLoadingBridges = sc.nextInt();
		                     AP.updateLoadingBridgeById(existingId, updateLoadingBridges);
				              break ;
							  
					case 3 : System.out.println("Enter the existing Name to update the no of checkin counters");
		                     String existingName = sc.next();
		                     System.out.println("Enter no of check in counters to be update");
		                     int updateCheckInCounters = sc.nextInt();
		                     AP.updateNoOfCheckInCoountersByName(existingName, updateCheckInCounters); 
							 break ;
							 
					case 4 : System.out.println("Enter the name to be deleted");
		                     String name1 = sc.next();
		                     AP.deleteTerminalsByName(name1);
							  break ;
					case 5 :  System.out.println("enter the id to be deleted");
		                      int id1 = sc.nextInt();
		                      AP.deleteTerminalsById(id1);
							  break ;
							  
					case 6 : AP.getAllTerminalName();
							  break;
							  
                    case 7 :  System.out.println("Enter the id to get terminal name");
					          int id2 = sc.nextInt();
							  System.out.println(AP.getTerminalNameById(id2));
							  break ;
                  							  
					default : System.out.println("Enter the valid choices");
					          break;

			 }
   /*AP.getTerminalDetails();
   System.out.println("Enter the noOfDepartureGates to be updated");
	 int updatedNoOfDepartureGates = sc.nextInt();


	 System.out.println("Enter the existing Id for noOfDepartureGates has to to be updated ");
	 int existingId = sc.nextInt();
	
	 AP.updateTerminalNoOfDepartureGatesById(existingId,updatedNoOfDepartureGates);
	  AP.getTerminalDetails();*/
	 


   }

   













}