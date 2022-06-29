class YesBank extends Bank{
      
	      @Override
        public void getInterest(double interest) {
			
			System.out.print("The Yes Bank ");
			interest = interest + 5.3;
			
		    super.getInterest(interest);
			
			
			
			
		}



}