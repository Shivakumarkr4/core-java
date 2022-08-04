package com.xworkz.atmapp;

import com.xworkz.atmapp.AtmException;

public class AtmMachine {
	
	public void check(int amount) {
		if(amount>=50000 || amount%100!=0) {
			System.out.println("withdraw your amount");
			throw new AtmException();
		}
		else {
			//PubException expection = new PubException();
			System.out.println("Enter the withdraw amount");
		}
		System.out.println("check method started");
	}

}
