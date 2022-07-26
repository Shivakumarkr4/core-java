package com.xworkz.airport.dto;

public class TerminalDTO {

	private int id;
	private String name ;
    private int noOfLoadingBridges;
	private int noOfDepartureGates;
	private int noOfCheckInCounters;
	
    public int getId()
	{
	  return id;	
	}
  
    public void setId(int id)
	{
	  this.id = id;	
	}

	 public String getName()
	{
	  return name;	
	}
  
    public void setName(String area)
	{
	  this.name = name;	
	}

	 public int getNoOfLoadingBridges()
	{
	  return noOfLoadingBridges;	
	}
  
    public void setNoOfLoadingBridges(int noOfLoadingBridges)
	{
	  this.noOfLoadingBridges = noOfLoadingBridges;	
	}

	 public int getNoOfDepartureGates()
	{
	  return noOfDepartureGates;	
	}
  
    public void setNoOfDepartureGates(int noOfDepartureGates)
	{
	  this.noOfDepartureGates= noOfDepartureGates;	
	}

	 public int getNoOfCheckInCounter()
	{
	  return noOfCheckInCounters;	
	}
  
    public void setNoOfCheckInCounters(int noOfCheckInCounters)
	{
	  this.noOfCheckInCounters= noOfCheckInCounters;	
	}









}
