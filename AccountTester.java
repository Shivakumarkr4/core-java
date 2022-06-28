class AccountTester{

  public static void main (String a[]){

   SavingsAccount sa = new SavingsAccount(0.3);
   sa.deposit(5000.00);
   sa.withdraw(500.00);
     double amount = sa.getBalance();
   System.out.println("Balance of Existing  Account "+ amount);
   





   SavingsAccount other = new SavingsAccount(0.3);


   sa.transfer(3000.00 , other);
   double totalAmount = other.getBalance();
   System.out.println("Balance of other Account "+ totalAmount);
   
   System.out.println("----------------------------------------------------------------------------------------");
   
   
   CurrentAccount ca = new CurrentAccount(20,1.2);
   ca.deposit(2000.00);
   ca.withdraw(500.00);
   ca.deposit(3000.00);
   ca.withdraw(1000.00);
   ca.deposit(2500.00);
   ca.withdraw(1500.00);
   ca.deductionOfFee();
   ca.periodicInterest();
   ca.getBalance();


}




}