class Furniture{

String name;
int price;
int nOfSeats;

//default constructor
 public Furniture(){
 
 System.out.println("The Furniture object is created");
 }


public Furniture(String name , int  price , int nOfSeats){

this();

this.name = name;
this.price = price;
this.nOfSeats = nOfSeats;

}

public static void main(String a[])
{
Furniture for1 = new Furniture(" wooden Furniture",15000,4);

System.out.println("The fruiture name is "+ for1.name  + " The fruniture price is " + for1.price + " The fruiture number of seats " + for1.nOfSeats);

}



























}