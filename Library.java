class Library{

 int id;
 String name;
 String type;
 int numberOftables;
static String location = "Bangalore";

public Library (int id,String name,String type,int numberOftables)
{
System.out.println("The library object is created ");

this.id = id;
this.name = name;
this.type = type;
this.numberOftables = numberOftables;

}
public static  void main(String a[]){

Library lib = new Library(2585, "kamadenu","private",100);

System.out.println("The library id is "+ lib.id);
System.out.println("The library name is "+lib.name);
System.out.println("The type of library is "+ lib.type);
System.out.println("The numberOftables in library "+ lib.numberOftables);
System.out.println("The location of library in "+ Library.location);
System.out.println("=================================================================");


Library lib1 = new Library(5469, "vision","private",150);

System.out.println("The library id is "+ lib1.id);
System.out.println("The library name is "+lib1.name);
System.out.println("The type of library is "+ lib1.type);
System.out.println("The numberOftables in library "+ lib1.numberOftables);
System.out.println("The location of library in "+ Library.location);
System.out.println("=================================================================");


Library lib2 = new Library(4465, "APJ","public",130);

System.out.println("The library id is "+ lib2.id);
System.out.println("The library name is "+lib2.name);
System.out.println("The type of library is "+ lib2.type);
System.out.println("The numberOftables in library "+ lib2.numberOftables);
System.out.println("The location of library in "+ Library.location);
System.out.println("=================================================================");


}


























}