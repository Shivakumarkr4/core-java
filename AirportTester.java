class AirportTester{

   public static void main (String a[])
   {
   AirportDTO ap = new AirportDTO();
   
   
   
   ap.setName("Kempegowda International Airport ");
   ap.setLocation("Bangalore ,Devanahalli");
   ap.setFocusCityFor("Air India,SpiceJet,Vistara");
   ap.setOperator("Bangalore International Airport Limited ");

    System.out.println("The airport name is "+ap.getName()+ "\n The airport location in "+ap.getLocation()+" \n The FocusCityFor "+ap.getFocusCityFor()+" \n The get Operator"+ap.getOperator());

     



    }

}