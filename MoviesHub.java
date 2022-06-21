class MoviesHub{

   static String movies[] = {"Charlie 777","Vikram","BBl2","KGF2","vikranthrona","pruthvi"};

   public static void main(String a[]) 
   {
   
   String mov = getMovies("BBl2");
   System.out.println("come.... will watch movie "+ mov);
   }
   
    public static String getMovies(String movie)
   {
     
	 String movieName = null;  
   for(int i=0; i < movies.length;i++)
   {
     if(movies[i] == movie){
		 movieName = movies[i];
	 }
   
   else  {
	   System.out.println(movie + " is not present in the array");
	   break;
   }
   }
   
   return movieName;
   
   }

}
