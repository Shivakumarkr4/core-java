class HistoricalPlaces{

String name;
int estd;
String style;
String location;

public HistoricalPlaces(String name, int estd, String style,String location)
{
System.out.println("The HistoricalPlace object is created ");

this.name = name;
this.estd = estd;
this.style = style;
this.location = location;

}

public static void main(String a[]){

HistoricalPlaces place = new HistoricalPlaces("Chennakeshava temple",1225,"Hoysala", "Belur");

System.out.println("The HistoricalPlace name is "+ place.name);
System.out.println("The etsd HistoricalPlace in "+ place.estd);
System.out.println("The HistoricalPlace style "+ place.style);
System.out.println("The location of HistoricalPlace in "+ place.location);

System.out.println("=================================================================================");



HistoricalPlaces place1 = new HistoricalPlaces("Virupaksha temple",1400,"Darvida", "Hampi");

System.out.println("The HistoricalPlace name is "+ place1.name);
System.out.println("The etsd HistoricalPlace in "+ place1.estd);
System.out.println("The HistoricalPlace style "+ place1.style);
System.out.println("The location of HistoricalPlace in "+ place1.location);

System.out.println("=================================================================================");


HistoricalPlaces place2 = new HistoricalPlaces("Gol Gumbaz tomb",1400,"indo islamic", "Bijapura");

System.out.println("The HistoricalPlace name is "+ place2.name);
System.out.println("The etsd HistoricalPlace in "+ place2.estd);
System.out.println("The HistoricalPlace style "+ place2.style);
System.out.println("The location of HistoricalPlace in "+ place2.location);

System.out.println("=================================================================================");







}





















} 