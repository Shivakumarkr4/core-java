class ElectronicDeviceTester{

public static void main(String a[]){

Tubelight tl = new Tubelight();

tl.modelNumber="10w b22 white batten led t-bulb pack of-01";
tl.type="LEd";
tl.material="Polyproplene";
tl.shape="straight linear";
tl.price=250;
tl.getSwitchOn();

System.out.println("The tubelight modelNumber is " + tl.modelNumber);
System.out.println("The tubelight type is "+ tl.type);
System.out.println("The tubeLight material is " + tl.material);

System.out.println("The tubeLight shape is " + tl.shape);
System.out.println("The tubeLight price is "+ tl.price);



}





}