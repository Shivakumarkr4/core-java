class NovelTester{

   public static void main(String a[]){
   
   NovelDTO nv = new NovelDTO();
   
   
   nv.setPublisher("Advaita Ashrama");
   nv.setLanguage("English");
   nv.setCountryOfOrigin("India");
   nv.setPrice(45);
   
   System.out.println("The book publisher name is "+ nv.getPublisher()+" \n The language of book "+nv.getLanguage()+" \n The Country Of Origin"+nv.getCountryOfOrigin()+" \n The cost of book "+nv.getPrice());
   
  
   
   
   }

}