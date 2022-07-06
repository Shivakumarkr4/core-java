 public class CarryBag{
 
 
   public CarryBag(){
   
   }
     
	 //to achive Ensapulation
   
     private String name;
	 private double price;
     
 
      //getter and setter = the way to access the private properties
 
 
      public String getName(){
	     return name;
	  
	  }
	  
       public void setName(String name ){
	       this.name = name;
	      
	   }
	   
	   public double getPrice(){
	      return price;
	   }
       
	   public void setPrice(double price){
	    this.price = price;
	   
	   }
       
		public void holdThings(){
		
		System.out.println("To hold the materials");
		} 
		
		
}
