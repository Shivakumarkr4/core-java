import java.util.Scanner;

class CustomerTester{

   public static void main(String a[]){
	    
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of order");
	 int size = sc.nextInt();
	 
	 Customer cs = new Customer(size);
	 
	 for(int i=0; i<size;i++){
		 
    OrderDTO od = new OrderDTO();
	
	System.out.println("Enter the order id ");
	int id = sc.nextInt();
	
	System.out.println("Enter the order name");
	String name = sc.next();
	
	System.out.println("Enter the order address");
	String address = sc.next();
	
	System.out.println("Enter the order contactNO ");
	long contactNO = sc.nextLong();
	
	System.out.println("Enter the order location");
	String location = sc.next();
   
   od.setId(id);
   od.setName(name);
   od.setAddress(address);
   od.setContactNo(contactNO);
   od.setLocation(location);
   cs.createOrder(od);
   }
   cs. getOrderDetails();


   }

   













}