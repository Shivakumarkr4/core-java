class HospitalTester{


    public static void main(String a[]){
          
     Hospital hos = new Hospital();

     PatientDTO dto = new PatientDTO();
     dto.setId(1);
	 dto.setName("sachin");
     dto.setAddress("Banglore");
     dto.setGender(Gender.MALE);
     dto.setContactNo(8494992342l);
	 
	
	
     PatientDTO dto1 = new PatientDTO();
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
     dto4.setContactNo(8494992342l);
	 
	 
	 
	 hos.createPatient(dto);
     hos.createPatient(dto1);
	 hos.createPatient(dto2);
	 hos.createPatient(dto3);
	 hos.createPatient(dto4);
     hos.getPatientDetails();
    
	}

}