class PatientTester{

   public static void main(String a[])
      {
	 
		PatientDTO patient = new PatientDTO();
		patient.setId(1);
		patient.setName("shivu");
		patient.setAddress("RR nagar");
		patient.setContactNo(8494992342l);
		patient.setGender(Gender.MALE);
		System.out.println(patient);
		/*patient.setId(1);
		int uniqueCode = patient.hashCode();
		System.out.println("HashCOde for patientDTO is "+uniqueCode);*/
	   
	   PatientDTO patient1 = new PatientDTO();
	   patient1.setId(2);
	   patient1.setName("Devi");
	   patient1.setAddress("RR nagar");
	   patient1.setContactNo(8722339902l);
	   patient1.setGender(Gender.female);
	   System.out.println(patient1);
		/*patient1.setId(2);
		int uniqueCode1 = patient1.hashCode();
		System.out.println("HashCOde for patientDTO is "+uniqueCode1);
		System.out.println(patient.equals(patient1));*/
		
	   
	   
	 }
   }