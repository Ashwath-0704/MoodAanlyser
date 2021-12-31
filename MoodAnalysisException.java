package com.javapractices;

public class MoodAnalysisException extends Exception {
	/**
	 * enum class
	 * 
	 * @param string
	 */
	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	ExceptionType type;

	/**
	 * UC3 construtor
	 * 
	 * @param string
	 */
	public MoodAnalysisException(String message) {
		super(message);
	}

	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
