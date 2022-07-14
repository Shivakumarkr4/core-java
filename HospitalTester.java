import java.util.Scanner;


class HospitalTester{


    public static void main(String a[]){
      
	  //Scanner class object creation 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the no of patient added"); 
	 int size = sc.nextInt();	 
	 
	 Hospital hos = new Hospital(size);
	 
	 for(int i=0; i<size;i++){
	
	 PatientDTO dto = new PatientDTO();
	
     System.out.println("Enter the patient Name ");
      String name = sc.next();
     
	 System.out.println("Enter the patient address");
     String address = sc.next();
     
	 System.out.println("Enter patient id");
     int id = sc.nextInt();
	 
	 System.out.println("Enter the contact number");
     long contactNO = sc.nextLong();
    	 
	 
	
	 dto.setId(id);
	 dto.setName(name);
     dto.setAddress(address);
     dto.setGender(Gender.MALE);
     dto.setContactNo(contactNO);
	 
	 hos.createPatient(dto);

	}
	 hos.getPatientDetails();
	 //invoking updatePatientAddressById method.
	 
	 
	  
	 System.out.println("Enter the address to be updated");
	 String updatedAddress = sc.next();


	 System.out.println("Enter the existing Id for address has to to be updated ");
	 int existingId = sc.nextInt();
	
	 hos.updatePatientAddressById(existingId,updatedAddress);
	 hos.getPatientDetails();
	 
	
     /*PatientDTO dto1 = new PatientDTO();
     dto1.setId(2);
	 dto1.setName("sushas");
     dto1.setAddress("managlore");
     dto1.setGender(Gender.female);
     dto1.setContactNo(8722339902l);
	 
	 
	 
	 PatientDTO dto2 = new PatientDTO();
     dto2.setId(4);
	 dto2.setName("sagar");
     dto2.setAddress("Hassan");
     dto2.setGender(Gender.MALE);
     dto2.setContactNo(9148756012l);
	
	 
	 PatientDTO dto3 = new PatientDTO();
     dto3.setId(5);
	 dto3.setName("sachin");
     dto3.setAddress("Tumkur");
     dto3.setGender(Gender.female);
     dto3.setContactNo(7349051564l);
	
	
	 PatientDTO dto4 = new PatientDTO();
     dto4.setId(22);
	 dto4.setName("Hema");
     dto4.setAddress("mysore");
     dto4.setGender(Gender.MALE);
     dto4.setContactNo(8494992342l);*/
	 
	 
	 

	 
     /*hos.createPatient(dto1);
	 hos.createPatient(dto2);
	 hos.createPatient(dto3);
	 hos.createPatient(dto4);*/
    
    
	}

}