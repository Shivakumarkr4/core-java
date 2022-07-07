class NewsPaperDTOTester{

   public static void main(String a[]){
   
   NewsPaperDTO np = new NewsPaperDTO();
   
   np.setName("Vijaya karnataka");
   np.setPrice(5);
   np.setLanguage("kannada");
   np.setType("Daily");
   
   System.out.println("The name of newspaper is "+ np.getName()+" \n The newspaper price is  "+np.getPrice()+" \n The newspaper langauage "+np.getLanguage()+" \n The type of newspaper"+np.getType());
   
   
   
   
   }

}
