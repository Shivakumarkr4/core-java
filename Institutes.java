class Institutes{

String name;
long contactNo;
String location;
int noOfStudents;

public Institutes( String name, long contactNo ,String location , int noOfStudents)
{
 System.out.println("The Institutes object is created");
this.name = name;
this.contactNo = contactNo;
this.location = location;
this.noOfStudents = noOfStudents;

}

public static void main(String a[])
{

Institutes inst = new Institutes("x workz",8494992342l,"Rajajinagar",30);

System.out.println("The Institute name is "+ inst.name);
System.out.println("The Institute contactNo is "+ inst.contactNo);
System.out.println("The Institute of location in "+ inst.location);
System.out.println("The  noOfStudents in x workz "+inst.noOfStudents);

System.out.println("================================================================");


Institutes inst1 = new Institutes("Rajiv Gandhi",8494992342l,"Hebbal bangalore",2000);

System.out.println("The Institute name is "+ inst1.name);
System.out.println("The Institute contactNo is "+ inst1.contactNo);
System.out.println("The Institute of location in "+ inst1.location);
System.out.println("The  noOfStudents in Rajiv Gandhi "+inst1.noOfStudents);

System.out.println("================================================================");


Institutes inst2 = new Institutes("Rv college" ,9148756012l, "Mysore Road bangalore",4455);

System.out.println("The Institute name is "+ inst2.name); 
System.out.println("The Institute contactNo is "+ inst2.contactNo);
System.out.println("The Institute of location in "+ inst2.location);
System.out.println("The  noOfStudents in Rv college "+inst2.noOfStudents);

System.out.println("================================================================");





}




















}