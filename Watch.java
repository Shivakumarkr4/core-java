class Watch{
 
 String brandName;
 String displayType;
 String color;
 int price;
 
 public Watch(String brandName, String displayType , String color , int price ){
 

this.brandName = brandName;
this.displayType = displayType;
this.color = color;
this.price = price; 

}
 public Watch(){
 
 
 this("Fasttrack","Analog","silver",3149);
 
 System.out.println("The Watch object is created ");
 }



public static void main (String a[]){

Watch wc = new Watch();

System.out.println("The watch brandName is " + wc.brandName + "The watch displayType is " +wc.displayType+ "The watch color is " +wc.color +"The watch price is " + wc.price);

}
























}