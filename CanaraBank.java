class CanaraBank extends Bank{
      
	      @Override
        public void getInterest(double interest) {
			
			System.out.print("The Canara Bank ");
			interest = interest + 1.8;
			
		    super.getInterest(interest);
			
			
			
			
		}



}