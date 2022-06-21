class Garden{

String name;
String location;
String type;
int area;
int noOfVistors;


public Garden(String nm, String loc, String typ, int ar, int nofv)
{
System.out.println("The garden object is created ");

name = nm;
location = loc;
type = typ;
area = ar;
noOfVistors = nofv;
}

public static void main(String a[]){

Garden park = new Garden("cubbon Park", "Bangalore ", "Romaing Garden ",  120 ,136556);

System.out.println("The garden name is "+ park.name);
System.out.println("The lo of garden in "+ park.location);
System.out.println("The type of gareden is "+ park.type);
System.out.println("The  area of covering in acre "+ park.area);
System.out.println("The noOfVistors in garden"+ park.noOfVistors);

System.out.println("============================================================================");


Garden park1 = new Garden("Lalbagh", "Bangalore ", "Romaing Garden ",  150 ,21544651);

System.out.println("The garden name is "+ park1.name);
System.out.println("The lo of garden in "+ park1.location);
System.out.println("The type of gareden is "+ park1.type);
System.out.println("The  area of covering in acre "+ park1.area);
System.out.println("The noOfVistors in garden"+ park1.noOfVistors);

System.out.println("============================================================================");













}






























}