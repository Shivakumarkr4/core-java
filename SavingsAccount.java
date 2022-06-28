class SavingsAccount extends BankAccount{

   double interestRate;
   
   public SavingsAccount(double interestRate){
   
  // super()will be called by complier

   this.interestRate = interestRate;
   
     }
   
   
   //Calcuate the periodicInterest 
   
    public double periodicInterest(){
	 double interest = getBalance()* interestRate/100;
	 deposit(interest);
	 return interest;
	
	
	}

}