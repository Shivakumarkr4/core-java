 class BankAccount{
   
       static double amount;
	   static double totalamount;
       	   
	 /**  public static void main(String a[]){
	   System.out.println("main method started");
	   // invoking method
	   deposit(6700.00);
	   withdraw(6500.00);
	   totalamount();
	   
	   deposit(12000.00);
	   withdraw(8000.00);
	   totalamount();
	   
	   deposit(16000.00);
	   withdraw(8200);
	   totalamount();
	   
	   deposit(14000.00);
	   withdraw(6500.00);
	   totalamount();
	   
	   deposit(12200.00);
	   withdraw(6800);
	   totalamount();
	   
	   deposit(8000.00);
	   withdraw(4200.00);
	   totalamount();
	   
	   deposit(5600.00);
	   withdraw(2200.00);
	   totalamount();
	   
	   deposit(4500.00);
	   withdraw(2100.00);
	   totalamount();
	   
	   deposit(6100.00);
	   withdraw(3200.00);
	   totalamount();
	   
	   deposit(14000.00);
	   withdraw(10200.00);
	   totalamount();
	   
	   System.out.println("main method ended");
	   }   */   
       
        public  double deposit(double amt){
			
		System.out.println("invoked deposit");
		System.out.println("Amount to be deposit"+amt);
		System.out.println("Amount before deposit"+amount);
		amount=amount+ amt;
		System.out.println("Amount after deposit"+amount);
		System.out.println("end of deposit");
		
		return amount;
		
	}
	   
	
	
	 public  double withdraw(double wd)
	 {
		System.out.println("invoked withdraw");
		System.out.println("Amount to be withdraw"+wd);
		System.out.println("Amount before withdraw"+amount);
		
		if(wd <= amount){
		amount=amount- wd;
		System.out.println("Amount after withdraw"+amount);
		System.out.println("end of withdraw");
		}
		else{
			System.out.println("insifficent balance");
		}
		
		return amount;
	}	

    public double getBalance()
	{
	
		System.out.println("The getBalance"+ amount);
		
		
		return amount;
		
	}

  //
  
    public void transfer(double tAmount , BankAccount other){
		if (tAmount <= amount)
		{
		withdraw(tAmount);
		other.deposit(tAmount);
		}
		
		
		else {
			System.out.println("The insifficent balance");
		}
	



	}



}





