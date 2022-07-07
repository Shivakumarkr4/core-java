 public class CarryBagDTO{
 
 
   public CarryBag(){
   
   }
     
	 //to achive Ensapulation
   
     private String name;
	 private double price;
     
 
      //getter and setter = the way to access the private properties
	  
      //we right getter by having a prefix as "get" than variable name.
	  //public returnType getVariableName(){
		  
		 // return VariableName;
	  //}
     
      public String getName(){
	     return name;
	  
	  }
	 
	  // we right setter by having aprefix as "set"
	  //public void setvariableName(datatype variableName){
		   // this.variableName = variableName;
		  //}
		  
       public void setName(String name ){
	       this.name = name;
	      
	   }
	   
	   public double getPrice(){
	      return price;
	   }
       
	   public void setPrice(double price){
	    this.price = price;
	   
	   }
       
		
		
}
