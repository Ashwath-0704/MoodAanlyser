package com.javapractices;

import com.javapractices.MoodAnalysisException.ExceptionType;

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
	 * UC1 and UC2 Refactor the code to take the mood message in Constructor
	 */
	public String analysemood() {
		if (message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}

	/*
	 * UC3 Inform user if entered Invalid Mood - In case of NULL or Empty Mood throw
	 * Custom Exception MoodAnalysisException
	 */
	public String analysemoodNew() throws MoodAnalysisException {
		if (message != null) {
			if (message.contains("Sad")) {
				System.out.println("Sad");
				return "SAD";
			}
		}
		ExceptionType enumEmpty = ExceptionType.ENTERED_NULL;
		throw new MoodAnalysisException(enumEmpty, "Invaid input");
	}
}
