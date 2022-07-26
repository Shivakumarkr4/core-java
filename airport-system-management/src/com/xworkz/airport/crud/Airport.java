package com.xworkz.airport.crud;

import com.xworkz.airport.dto.TerminalDTO;

public interface Airport  {

	boolean createTerminal(TerminalDTO terminal);
	void getTerminalDetails();
	boolean updateTerminalNoOfDepartureGatesById(int id, int noOfDepartureGates);
	boolean updateLoadingBridgeById(int id, int noOfLoadingBridges);
	boolean updateNoOfCheckInCoountersByName(String name, int noOfCheckIncounters);
	 boolean deleteTerminalsByName(String name);
	  String[] getAllTerminalName();
	 boolean deleteTerminalsById(int id);
	 String getTerminalNameById(int id);

}
