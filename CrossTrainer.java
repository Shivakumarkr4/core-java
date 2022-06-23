class CrossTrainer{

String brandName;
int price;
String motorType;
String maximumWeightCapacity;

public CrossTrainer(){

System.out.println("The CrossTrainer object is created ");

}

public CrossTrainer(String brandName , int price , String motorType , String maximumWeightCapacity){

this();

this.brandName = brandName;
this.price = price;
this.motorType = motorType;
this.maximumWeightCapacity = maximumWeightCapacity;

}

public static void main(String a[]){

CrossTrainer ct = new CrossTrainer("Jerai" , 60000 , "Frontdrive" , "100kg");

System.out.println("The CrossTrainer brand name is "+ ct.brandName + "  The CrossTrainer price is " +ct.price + "  The CrossTrainer motorType is "+ ct.motorType +"  The maximumWeightCapacity of CrossTrainer "+ct.maximumWeightCapacity);







}






























}