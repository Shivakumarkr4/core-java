class ModeOfTransportTester{

public static void main (String a[]){


Bus bu = new Bus();

bu.brandName = "KSRTC";
bu.owner= "under government";
bu.contactNo = 8494992342l;

 bu.getGovtBus();
System.out.println("The bus brand name is "+ bu.brandName);
System.out.println("The bus owner name is " + bu.owner);
System.out.println("The contact number is " + bu.contactNo);

}

}