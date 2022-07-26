package com.xworkz.airport.crud.impl;

import java.util.Arrays;

import com.xworkz.airport.crud.Airport;
import com.xworkz.airport.dto.TerminalDTO;

public class Airportimpl implements Airport {

	TerminalDTO[] terminal;
	   int index;

	    public Airportimpl(int size){
		terminal = new TerminalDTO[size];
		 System.out.println("Airport constructor is called");
		  
	    }   
	      @Override
	     public boolean createTerminal(TerminalDTO terminal){
		   System.out.println("Inside the create types of terminal"); 
		   
		   boolean isAdded = false;
		   if(terminal != null && terminal.getId() != 0){
			   this.terminal[index++] = terminal;
			   isAdded = true;
			   System.out.println("The terminal detail is added");
			   
			  }
			  
			  else{
				  System.out.println("The required terminal is not here");
			  }
		     
			 return isAdded;
		   
		   }
	         @Override
	      public void getTerminalDetails()
		  {
			 System.out.println("inside getTerminalDetails"); 
			  
			  for(int i=0; i<terminal.length;i++)
			  {
			  System.out.println("The terminal id is "+terminal[i].getId()+" \n The total terminal is  "+terminal[i].getName()+" \n The get NoOfLoadingBridges "+terminal[i].getNoOfLoadingBridges()+" \n The getNoOfDepartureGates is "+terminal[i].getNoOfDepartureGates()+" \n The getNoOfCheckInCounter "+terminal[i].getNoOfCheckInCounter());	  
		     }
			  
			  
		 }
			@Override
			public boolean updateTerminalNoOfDepartureGatesById(int id, int noOfDepartureGates){
				
				System.out.println("inside updateTerminalNoOfDepartureGatesById()");
			
				boolean updateNoOfDepartureGates = false;
				for(int i=0; i<terminal.length;i++){
					if(terminal[i].getId() == id){
					terminal[i].setNoOfDepartureGates(id);
						updateNoOfDepartureGates = true;
						
				    }
					
					else{
						System.out.println("please update the NoOfDepartureGates first");
					 }
					 
				}
				
			     return updateNoOfDepartureGates;
			}
			
			@Override
			public boolean updateLoadingBridgeById(int id, int noOfLoadingBridges){
			 
			 System.out.println("Inside updateLoadingBridgeById ");
			 boolean updateNoOfLoadingBridge = false;
			 for(int i=0; i<terminal.length;i++){
				 if(terminal[i].getId() == id ){
					 terminal[i].setNoOfLoadingBridges(noOfLoadingBridges);
					 updateNoOfLoadingBridge = true;
					 
				 }
				 else{
					 System.out.println("The terminal id is not found");
				 }
			 }
			 return updateNoOfLoadingBridge;
		 }
		     @Override
		 public boolean updateNoOfCheckInCoountersByName(String name, int noOfCheckIncounters){
			 
			 System.out.println("Inside updatePatientContactNoByName ");
			 boolean updateCheckInCounters = false;
			 for(int i=0; i<terminal.length;i++){
				 if(terminal[i].getName().equals(name)){
					 terminal[i].setNoOfCheckInCounters(noOfCheckIncounters);
					 updateCheckInCounters = true;
					 
				 }
				 else{
					 System.out.println("The terminal name is not found");
				 }
			 }
			 return updateCheckInCounters;
		 }
		    @Override
		 public boolean deleteTerminalsByName(String name){
			 System.out.println("inside deleteTerminalsByName");
			 boolean terminalDeleted = false;
			 int i,j;
			 for(i=0,j=0; j<terminal.length;j++){
				 if(!terminal[j].getName().equals(name)){
					 terminal[i++]=terminal[j];
					 terminalDeleted=true;
				 }
				 else{
					 System.out.println("The terminal is not found");
				 }
			 }
			 terminal = Arrays.copyOf(terminal, i);
			 return terminalDeleted;
			 
		 }
		 @Override
		 public boolean deleteTerminalsById(int id){
			 System.out.println("Inside deleteTerminalsById");
			 boolean terminalDeleted=false;
			 int i,j;
			 for(i=0,j=0;j<terminal.length;j++){
				 if(terminal[j].getId()!=id){
					 terminal[i++]=terminal[j];
					 terminalDeleted=true;
				 }
				 else{
					 System.out.println("the termial id not found");
				 }
			 }
			 terminal = Arrays.copyOf(terminal, i);
			 return terminalDeleted;
		 }
			@Override
		 public String[] getAllTerminalName(){
			 System.out.println("Inside getAllTerminalName()");
			 int i,j;
			 for( j=0,i=0;i<terminal.length;i++){ 
			     System.out.println(terminal[i].getName());
				  j++;
			 }
			    
			    String[] allTerminalNames = new String[j];
			  for(int k=0,m=0;k<terminal.length;k++){
				 allTerminalNames[m++] = terminal[k].getName(); 
			  }

			 return allTerminalNames;
		 }
			@Override
		 public String getTerminalNameById(int id){
			 System.out.println("Inside getTerminalNameById()");
			 String terminalName = null;
			 for(int i=0; i<terminal.length;i++){
				 if(terminal[i].getId()==id){
					 terminalName = terminal[i].getName();
				 }
				 else{
					 System.out.println("The Terminal id not matched");
				 }
				 
			 }
			 return terminalName;
		 }
		 


}
