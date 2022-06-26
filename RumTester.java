class RumTester{

public static void main(String a[]){
  
  OldMonk old = new OldMonk();
  
  old.price = 440.00;
  old.alocholcontent= "42.7 % ";
  old.quantity = "750ml";
  old.mfgDate = "2 april 2022";
  old.expiry = "Best before 36 months";
  old.toGetkick();
  
  System.out.println("The old monk price is " + old.price  + "The old monk alocoholContent percentage is  " + old.alocholcontent+ "The old monk quantity is  "+old.quantity+ "The old monk mfgDate is " +old.mfgDate+ "The old monk expiry " +old.expiry);


}






}