import java.util.Arrays;


class Hotel{
	
	
	  FoodItemsDTO[] foodItems;
	  int index;
	
	  public Hotel(int size){
		
		foodItems = new FoodItemsDTO[size];
		System.out.println("Hotel constructor is called");
	 }


      public boolean createFoodItems(FoodItemsDTO foodItems){
		  System.out.println("inside the create types of foodItems");
		  
		  boolean isAdded = false;
		  if(foodItems != null && foodItems.getName() != null){
		   this.foodItems[index++] = foodItems;
		   isAdded = true;
		   System.out.println("The foodItems detail is added");
		   
		  }
		  
		  else{
			  System.out.println(" The required foodItems is not here");
		  }
		  
		   return isAdded;
	  }

    public void getFoodItemsDetails(){
		System.out.println("inside the getFoodItemsDetails");
		
		for(int i=0; i<foodItems.length;i++){
			
			System.out.println("The foodItems id is "+foodItems[i].getId()+" \n The foodItems name is  "+foodItems[i].getName()+" \n The type of foodItems "+foodItems[i].getType()+" \n The food price is  "+foodItems[i].getPrice());
		}
		
	}

		 public boolean updateHotelPriceByName(int price , String name){
		System.out.println("inside the updateHotelPriceByName");
		
		boolean updatePrice = false;
		
		for(int i=0; i<foodItems.length;i++){
		if(foodItems[i].getPrice() == price){	
		 foodItems[i].setPrice(price);
		 updatePrice= true;
		 
		}
		  else{
			  System.out.println("please enter the correct price");
		  }
		  
		  }
	         return updatePrice;
		}	
	public boolean deleteFoodItemsDetailsByName(String name){
					boolean foodItemsDeleted = false;
					System.out.println("inside deleteBooksDetailsByNames");
					int i,j;
					for (i=0 ,j=0 ; j<foodItems.length;j++){
						
					    if(!foodItems[j].getName().equals(name)){
							foodItems[i++]=foodItems[j];
							foodItemsDeleted=true;
							
					    }
						else{
							System.out.println("the foodItems is not available");
						}
					}
					
					foodItems= Arrays.copyOf(foodItems,i);
					return foodItemsDeleted;
				}


}