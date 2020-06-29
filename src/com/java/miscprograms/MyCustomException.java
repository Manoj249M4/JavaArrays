package com.java.miscprograms;

public class MyCustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3470101509813947848L;
	public String message;

	public MyCustomException(String message) {
		super();
		this.message = message;
	}

	public String toString(){
		return ("My Custom exception: "+message); 	
	}
}
