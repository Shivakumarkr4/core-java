class Multiply{
 
    public static void main(String a[])
	{
	  int finalValue = mul(65,95,85);
	  System.out.println(finalValue);
	  
	  int finalValue1 = mul(85,95);
	  System.out.println(finalValue1);
	  
 int finalValue2 =	mul(98,86,62); 
 System.out.println(finalValue2);
	 
	}
	public static int mul(int a ,int b,int c)
	
	{
    return a*b*c;	
	
    }
	public static int mul(int a, int b)
	{
		return a*b;
	}
}