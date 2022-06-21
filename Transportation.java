 class Transportation{
 
 int transportid;
   String name;
   String type;
   long helpLineNo;

   
   public Transportation(int transportid,String name,String type,long helpLineNo)
  {
  
  System.out.println("The transportation object created");
    this.transportid = transportid;
    this.name = name;
    this.type =  type;
    this.helpLineNo = helpLineNo;
   
  }
   
   public static void main (String a[])
   {
   
   Transportation transport = new Transportation (15,"metro","roadways",8494992342l);
   
   System.out.println("The transport id  "+ transport.transportid);   
   System.out.println("The transportation name is  "+ transport.name);
   System.out.println("The transportation type  "+ transport.type );
   System.out.println("The transportation helpLineNo is "+ transport.helpLineNo);
   
   System.out.println("===============================================================================================");
   
      
  Transportation airways = new Transportation (35,"jet airways","airways",8722339902l);
 System.out.println("The transport id "+ airways.transportid);
 System.out.println("The transportation name is  "+ airways.name);
 System.out.println("The transportation type "+ airways.type);  
 System.out.println("The transportation helpLineNo "+ airways.helpLineNo);  
   
 System.out.println("======================================================================================================");  
   
   Transportation waterways = new Transportation (55,"tatitanic","waterways",9148756012l);
 System.out.println("The transport id "+ waterways.transportid);
 System.out.println("The transportation name is  "+ waterways.name);
 System.out.println("The transportation type "+ waterways.type);  
 System.out.println("The transportation helpLineNo "+ waterways.helpLineNo);  
   
 System.out.println("======================================================================================================");  
   
   
   
   }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }