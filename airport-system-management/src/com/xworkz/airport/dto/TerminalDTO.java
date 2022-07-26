package com.xworkz.airport.dto;

import lombok.Data;

@Data

public class TerminalDTO {

	private int id;
	private String name ;
    private int noOfLoadingBridges;
	private int noOfDepartureGates;
	private int noOfCheckInCounters;
	
    


}
