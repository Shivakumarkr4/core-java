class IdbiBank extends Bank{
      
	      @Override
        public void getInterest(double interest) {
			
			System.out.print("The Idbi Bank ");
			interest = interest + 4.6;
			
		    super.getInterest(interest);
			
			
			
			
		}



}