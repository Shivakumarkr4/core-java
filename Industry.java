class  Industry{

String name;
String type;
String industry;
int founded;
static String location = "Bangalore";

public Industry(String name, String type,String industry, int founded){

System.out.println("The industry object is created");
 this.name = name;
 this.type = type;
 this.industry = industry;
 this.founded = founded;
 
}
public static void main(String a[])
{

Industry ind = new Industry("Brigade","Public","Real estate", 1986 );

System.out.println("The industry name is "+ ind.name);
System.out.println("The industry type is "+ ind.type);
System.out.println("The type of industry is "+ ind.industry);
System.out.println("The industry is founded in "+ ind.founded);
System.out.println("The industry location in "+ Industry.location);

System.out.println("===========================================================");


Industry ind1 = new Industry("RNS","Public","Real estate", 1992 );

System.out.println("The industry name is "+ ind1.name);
System.out.println("The industry type is "+ ind1.type);
System.out.println("The type of industry is "+ ind1.industry);
System.out.println("The industry is founded in "+ ind1.founded);
System.out.println("The industry location in "+ Industry.location);

System.out.println("===========================================================");



Industry ind2 = new Industry("Prestige","Public","Real estate", 1996 );

System.out.println("The industry name is "+ ind2.name);
System.out.println("The industry type is "+ ind2.type);
System.out.println("The type of industry is "+ ind2.industry);
System.out.println("The industry is founded in "+ ind2.founded);
System.out.println("The industry location in "+ Industry.location);

System.out.println("===========================================================");







}























}