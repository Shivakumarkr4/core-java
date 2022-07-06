class WeaponsTester{

   public static void main(String a[]){
   
   Weapons wp = new Weapons();
   
   wp.setName("SLR");
   wp.setPrice(25000);
   wp.setBullets("6 number");
   wp.setType("Long range");
   
   System.out.println("The weapon name is "+ wp.getName()+" \n The weapon price is  "+wp.getPrice()+" \n The number of bullets "+wp.getBullets()+" \n The type of bullet"+wp.getType());
   
   wp.useOfWeapons();
   
   
   }

}