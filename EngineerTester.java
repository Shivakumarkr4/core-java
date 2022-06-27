class EngineerTester{

public static void main(String a[]){

CivilEngineer cv = new CivilEngineer();

cv.designation = "Quality engineer";
cv.salary = 25000;
cv.experience = "6 years";
cv.technicalSkills = "CADD structure";
cv.getRecruit();
cv.problemSolving();

System.out.println(" The designation of "+cv.designation+" The salary of quality engineer "+cv.salary+" The experience of quality engineer in  "+cv.experience+
 " The technicalSkills are " +cv.technicalSkills);
 
 System.out.println("================================================================================================================================");
 
MechEngineer me = new MechEngineer();

me.designation = "Designer";
me.salary = 25000;
me.experience = "4 years";
me.technicalSkills = " AutoCADD";
me.getRecruit();
me.problemSolving();

System.out.println(" The designation of "+me.designation+" The salary of Desinger engineer "+me.salary+" The experience of Designer engineer in  "+me.experience+
 " The technicalSkills are " +me.technicalSkills);

System.out.println("=======================================================================================================================================");

CsEngineer cs = new CsEngineer();

cs.designation = "web deveoper";
cs.salary = 50000;
cs.experience = "4 years";
cs.technicalSkills = " java full stack";
cs.getRecruit();
cs.problemSolving();

System.out.println(" The designation of "+cs.designation+" The salary of web developer engineer "+cs.salary+" The experience of web developer engineer in  "+cs.experience+
 " The technicalSkills are " +cs.technicalSkills);


System.out.println("=======================================================================================================================================");

EcEngineer ec = new EcEngineer();

ec.designation = "Communication engineer";
ec.salary = 42000;
ec.experience = "3 years";
ec.technicalSkills = "core java";
ec.getRecruit();
ec.problemSolving();

System.out.println(" The designation of "+ec.designation+" The salary of communication  engineer "+ec.salary+" The experience of communication engineer in  "+ec.experience+
 " The technicalSkills are " +ec.technicalSkills);


System.out.println("=======================================================================================================================================");


EeeEngineer eee = new EeeEngineer();

eee.designation = "Assitance engineer";
eee.salary = 42000;
eee.experience = "3 years";
eee.technicalSkills = "Networking analysis";
eee.getRecruit();
eee.problemSolving();

System.out.println(" The designation of "+eee.designation+" The salary of Assistance  engineer "+eee.salary+" The experience of Assistance engineer in  "+eee.experience+
 " The technicalSkills are " +eee.technicalSkills);


System.out.println("=======================================================================================================================================");





}





}