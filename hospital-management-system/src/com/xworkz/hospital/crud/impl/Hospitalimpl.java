package com.xworkz.hospital.crud.impl;

import java.util.Arrays;

import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.dto.PatientDTO;

public class Hospitalimpl implements Hospital {



	// Has many patients
	PatientDTO[] dtos ;

	// instance variable
	int index;

	//constructor
	public Hospitalimpl(int size){
		dtos = new PatientDTO[size];
		System.out.println("Hospital constructor is called");
	}
	//create
	@Override
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
	//Read
	@Override
	public void getPatientDetails(){
		System.out.println("inside the getPatientDetails()"); 
		for(int i=0; i<dtos.length;i++){
			System.out.println(dtos[i]);


			//System.out.println(" The id is "+dtos[i].getId()+" \n The patient name is "+dtos[i].getName()+" \n The patient address is "+dtos[i].getAddress()+" \n The gender is "+dtos[i].getGender()+" \n The patient contact number is "+dtos[i].getContactNO()); 

		}

	} 

	//update

	@Override
	public boolean updatePatientAddressById(int id, String address){

		System.out.println("inside updatePatientAddressById()");

		boolean updateAddress = false;
		for(int i=0; i<dtos.length;i++){
			if(dtos[i].getId() == id){
				dtos[i].setAddress(address);
				updateAddress = true;

			}

			else{
				System.out.println("please update the patient address first");
			}

		}


		return updateAddress;
	}

	@Override
	public boolean updatePatientContactNoByName(String name,long contactNo){

		System.out.println("inside updatePatientContactNoByName()");

		boolean updateContactNo = false;
		for(int i=0; i<dtos.length;i++){
			if(dtos[i].getName().equals(name)){
				dtos[i].setContactNo(contactNo);
				updateContactNo= true;
				System.out.println("patient's contact No is update");

			}

			else{
				System.out.println("patient Id is not found");
			}

		}


		return updateContactNo;

	}

	@Override
	public boolean deletePatientDetailsByName(String name){
		boolean patientDeleted = false;
		System.out.println("inside deletepatientByName");
		//multipile insilization
		int newIndex,oldIndex;
		for (newIndex=0 ,oldIndex=0 ; oldIndex<dtos.length;oldIndex++){
			//"Hitesh".equals("hitesh")
			if(!dtos[oldIndex].getName().equals(name)){
				//dtos[0] = dtos[0];
				dtos[newIndex++]=dtos[oldIndex];
				patientDeleted=true;

			}
			else{
				System.out.println("the patientis not found");
			}
		}

		dtos= Arrays.copyOf(dtos,newIndex);
		return patientDeleted;
	}

	@Override
	public String getPatientNameById(int id){
		String patientName = null;
		for(int i=0; i<dtos.length;i++){
			if(dtos[i].getId()==id){
				patientName=dtos[i].getName();

			}
			else{
				System.out.println("The patient id is not found");
			} 
		}
		return patientName;  
	}
	@Override
	public long getPatientContactNoByName(String name){
		long patientContactNo = 0;
		for(int i=0; i<dtos.length;i++){
			if(dtos[i].getName().equals(name)){
				patientContactNo=dtos[i].getContactNo();

			}
			else{
				System.out.println("The patient name is not found");
			} 
		}
		return patientContactNo;  
	}


}











