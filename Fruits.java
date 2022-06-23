class Fruits{


String name;
int price;

public Fruits(){
	
	this.getNutritions();
	System.out.println("Fruits object is created");
	
}
 
   public static void main(String a[]){
   
   
   Fruits f = new Fruits ("mango",200);
   
   System.out.println(f.name + ""+ f.price);
   
   
     
 }
public  Fruits(String name,int price){
	
this();

this.name = name;
this.price = price;

}
public void getNutritions(){
	
	System.out.println("helps us to get Nutrition");
}




 /*COMPLIER ALWAYS POINTING TOWARDS THE PARAMETR OR LOCAL VARIABLES

  Fruits.java: error : invalid method declaration ; return required 

public fruits (String name , int price)
^1 errror

 methodvs constructor.
class vs objects.
instance vs static.

this keyword method must be always consider inside the constructor.

this(); :- this method to call one constructor from a another constructor with in the same class purpose
*/









}