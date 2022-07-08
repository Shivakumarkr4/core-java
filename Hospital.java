class Hospital{
    
	// Has many patients
       PatientDTO[] dtos ;
   
    // instance variable
       int index;

    //constructor
     public Hospital(int size){
		 dtos = new PatientDTO[size];
	 System.out.println("Hospital constructor is called");
	 }
	 
	 public boolean createPatient(PatientDTO dto){
		 System.out.println("inside createPatient");
		 boolean isAdded = false;
		 if(dto !=null && dto.getName()!=null){
			this.dtos[index++] = dto;
			 isAdded = true;
			System.out.println("The patient detailed saved..."); 
			 
		}
		 
		 else 
		 {
			 System.out.println("cannot add patient...please add ");
		 }
		 
		 return isAdded;
		 
		 
		}
   
     public void getPatientDetails(){
		System.out.println("inside the getPatientDetails()"); 
		 for(int i=0; i<dtos.length;i++){
			 
			System.out.println(" The id is "+dtos[i].getId()+" \n The patient name is "+dtos[i].getName()+" \n The patient address is "+dtos[i].getAddress()+" \n The gender is "+dtos[i].getGender()+" \n The patient contact number is "+dtos[i].getContactNO()); 
			
		 }
		 
		 
	 } 
   
}









