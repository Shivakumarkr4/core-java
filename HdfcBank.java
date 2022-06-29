class HdfcBank extends Bank{
      
	      @Override
        public void getInterest(double interest) {
			
			System.out.print("The Hdfc Bank ");
			interest = interest + 2.8;
			
		    super.getInterest(interest);
			
			
			
			
		}



}