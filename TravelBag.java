class TravelBag{

String brandName;
String material;
String color;
String capacity;
int price;

public TravelBag(String brandName, String material, String color , String capacity, int price){
 
 
 this.brandName = brandName;
 this.material = material;
 this.color = color;
 this.capacity = capacity;
 this.price = price;

}

public TravelBag(){
 this("Impulse", "polyester","Blue","75l",1600);
 
 System.out.println("The TravelBag object is created");

}

public static void main(String a[]){

TravelBag tr = new TravelBag();

System.out.println("The TravelBag brandName is " +tr.brandName+ "The TravelBag material is " +tr.material+ "The TravelBag color is " +tr.color+ "The TravelBag capacity of  " +tr.capacity +"The TravelBag priceis " + tr.price);



}

















}