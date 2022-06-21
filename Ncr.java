class Ncr{
  public static void main(String a[]){
  int ncr = fact(6)/(fact(4) * fact(6-4)) ;
  System.out.println(ncr);
                                                                        //ncr =n!/r!(n-r)!
  }
  
  public static int fact(int a)
{
  int  f=1;
   for (int i=1; i<=a;i++)
{
   f= f*i;
}
  return f;

}















}