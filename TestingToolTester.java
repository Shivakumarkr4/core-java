class TestingToolTester{

public static void main (String a[]){

Selenium sn = new Selenium();

sn.startedIn = 2006;
sn.type = "Object oriented";
sn.designedby = "Simon Stewert";

sn.getTesting();

System.out.println(" The Selenuium startedIn " + sn.startedIn+ " The Selenium type is " +sn.type+ " The Selenuium is designed by  " + sn.designedby);
}

}