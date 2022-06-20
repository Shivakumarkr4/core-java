class ShowRoom1{
	
	//initialize
  int showRoomId;
  static String name;
  static int noOfBranches;
  String location;
  long contactNo;
  
  //parameterized Constructor
public ShowRoom1(int showRoomId, String name, long contactNo,String location,  int noOfBranches){

	//this keyword help complier to point to instance variables
	
	
	this.showRoomId = showRoomId;
	this.contactNo = contactNo;
	this.location = location;
	this.name = name;
	this.noOfBranches= noOfBranches;
}
  //default Constructor
  public ShowRoom1(){
  
  System.out.println("ShowRoom object is created");
  
 }
 //main method
  public static void main(String a[])
  
  {
  //constructor are used to initaial variables of class
  ShowRoom1 show = new ShowRoom1(1,"Puma", 8494992342l,"M G Road", 58);

  
 /*show.showRoomId = 1;
 show.location = "Mg Road";
 show.contactNo = 8494992342l;*/

  System.out.println("The showRoomId id is "+ show.showRoomId);
  System.out.println("The showroom name is  "+name);
  System.out.println("The number of showroom branches "+ noOfBranches);
  System.out.println("The showroom loctaion is " + show.location);
  System.out.println("The showroom contactNo is " + show.contactNo);
  
 System.out.println("---------------------------------------------------------------------");
  
  
  ShowRoom1 show1 = new ShowRoom1(2,"Adidas",8494992342l,"Brigade Road",65 );
  
 /*show1.showRoomId = 2;
 show1.location = "Brigade Road";
 show1.contactNo = 8494992342l;*/

  System.out.println("The showRoomId id is "+ show1.showRoomId);
  System.out.println("The showroom name is  "+name);
  System.out.println("The number of showroom branches "+ noOfBranches);
  System.out.println("The showroom loctaion is " + show1.location);
  System.out.println("The showroom contactNo is " + show1.contactNo);
  
  
  
  
  
  
  
  
  }
  






























}