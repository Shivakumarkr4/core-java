import java.util.Scanner;

class HotelTester{

   public static void main(String a[]){
	    
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of foodItem");
	 int size = sc.nextInt();
	 
	 Hotel HL = new Hotel(size);
	 
	 for(int i=0; i<size;i++){
		 
    FoodItemsDTO FI = new FoodItemsDTO();
	
	System.out.println("Enter the foodItem id ");
	int id = sc.nextInt();
	
	System.out.println("Enter the foodItem name");
	String name = sc.next();
	
	System.out.println("Enter the foodItem type");
	String type = sc.next();
	
	System.out.println("Enter the foodItem contactNO");
	long contactNO = sc.nextLong();
	
	System.out.println("Enter the foodItem location");
	String location = sc.next();
   
   FI.setId(id);
   FI.setName(name);
   FI.setType(type);
   FI.setContactNo(contactNO);
   FI.setLocation(location);
   HL.createFoodItems(FI);
   }
   HL.getFoodItemsDetails();


   }

   













}