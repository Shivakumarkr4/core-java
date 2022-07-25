package com.xworkz.hospital.crud;

import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {

	boolean createPatient(PatientDTO dto);
	void getPatientDetails();
	boolean updatePatientAddressById(int id, String address);
	boolean updatePatientContactNoByName(String name,long contactNo);
	boolean deletePatientDetailsByName(String name);
	String getPatientNameById(int id);
	long getPatientContactNoByName(String name);





}
