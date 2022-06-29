class KarBank extends Bank{
      
	      @Override
        public void getInterest(double interest) {
			System.out.print("The Karnataka Bank ");
			interest = interest + 3.5;
			
		    super.getInterest(interest);
			
			
			
			
		}



}