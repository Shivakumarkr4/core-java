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
   AP.getTerminalDetails();


   }

   













}