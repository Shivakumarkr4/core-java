class IcicBank extends Bank{
      
	      @Override
        public void getInterest(double interest) {
			
			System.out.print("The Icic Bank ");
			interest = interest + 4.5;
			
		    super.getInterest(interest);
			
			
			
			
		}



}