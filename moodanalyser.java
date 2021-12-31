package com.javapractices;

public class moodanalyser {
	String message;

	/**
	 * Default construtor
	 */
	public moodanalyser() {
		super();
	}

	/**
	 * Parameters construtor
	 * 
	 * @param
	 */
	public moodanalyser(String message) {
		super();
		this.message = message;
	}

	/*
	 * UC1 and UC2 
	 * Refactor the code to take the mood message in Constructor
	 */
	public String analysemood() {
		if (message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}
}
