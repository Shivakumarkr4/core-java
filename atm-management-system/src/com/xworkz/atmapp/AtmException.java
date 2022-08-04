package com.xworkz.atmapp;

public class AtmException extends RuntimeException {
	@Override
	public String toString() {
		return "Your reached maximum amount please select valid amount";
	}
	

}
