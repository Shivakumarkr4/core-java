class SbiBank extends Bank{
      
	      @Override
        public void getInterest(double interest) {
			
			System.out.print("The Sbi Bank ");
			
			interest = interest + 6.5;
			
		    super.getInterest(interest);
			
			
			
			
		}



}