class LapTopTester{

  public static void main(String a[]){
    
	LapTopDTO lp = new LapTopDTO();
	
	lp.setName("Asus");
    lp.setPrice(35000.00);
    lp.setRam("8 GB");
    lp.setColor("Balck");
    lp.setOperatingSystem("Windows 11");
    
	System.out.println("The laptop brand name "+lp.getName() + "\n The laptopprice is " + lp.getPrice()+ "\n The laptop ram is  " + lp.getRam()+"\n The laptop color is "+lp.getColor()+"\nThe laptop Operating system is "+lp.getOperatingSystem());
	
	
	
  }
}