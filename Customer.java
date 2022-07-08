class Customer{

  OrderDTO[] order;
  
  int index;

    public Customer(int size){
	   
	   order =  new OrderDTO[size];
	   
	   System.out.println("customer constructor is called");  
    }

      public boolean createOrder(OrderDTO order){
		System.out.println("inside the create types of order");  
		  
		 boolean isAdded = false;
         if(order!=null && order.getName() !=null) {
			this.order[index++] = order;
				isAdded = true;
			System.out.println("The order detailed is saved ");	
			 
		 }     
         else{
			 System.out.println("The required order is not here");
		 }
			
			return isAdded;
	  
	  }

       public void getOrderDetails(){
         System.out.println("inside getOrderDetails");
		   for(int i=0; i<order.length;i++){
			   
			   System.out.println("The order id is " +order[i].getId()+" \n The order name is "+order[i].getName()+" \n The adress is "+order[i].getAddress()+"\n The contactNo is "+order[i].getContactNo()+" The location of the order is "+order[i].getLocation());
		   }
		 
		}
}

