class MobileCompanyTester{

public static void main(String a[]){

Sony sony = new Sony();

sony.industry = "Telecommunication ";
sony.owner = "Sony Corporation";
sony.headquaters = "Shinagawa, Tokoyo ,japan";
sony.founded = 2001;

System.out.println(" The MobileCompany  industry " +sony.industry+" The MobileCompany owner is "+sony.owner+" The MobileCompany headquaters in "+sony.headquaters+" The MobileCompany was founded in"+ sony.founded);

sony.getCommunication();


}



}