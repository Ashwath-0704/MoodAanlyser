package com.javapractices;

import org.junit.Assert;
import org.junit.Test;

import com.javapractices.MoodAnalysisException.ExceptionType;

public class MoodAnalyserTest {
	/*
	 * UC1 and UC2 Testing
	 */
	@Test
	public void sadJUnitTestingException() {
		try {
			moodanalyser m = new moodanalyser();
			String sadJUnitTesting = m.analysemood();
			Assert.assertEquals("SAD", sadJUnitTesting);
		} catch (Exception e) {
			System.out.println("1)HAPPY");
		}
	}

	/*
	 * UC1 and UC2 Testing
	 */
	@Test
	public void happyJUnitTestingException() {
		try {
			moodanalyser m = new moodanalyser();
			String sadJUnitTesting = m.analysemood();
			Assert.assertEquals("HAPPY", sadJUnitTesting);
		} catch (Exception e) {
			System.out.println("2)SAD");
		}
	}

	/*
	 * UC3 Testing
	 */
	@Test
	public void sadJUnitTestingCustomExceptionMoodAnalysisException() {
		try {
			moodanalyser m = new moodanalyser();
			String sadJUnitTesting = m.analysemoodNew();
			Assert.assertEquals("SAD", sadJUnitTesting);
		} catch (MoodAnalysisException e) {
			ExceptionType enumEmpty = ExceptionType.ENTERED_NULL;
			System.out.println(enumEmpty+" MoodAnalysisException throws --> HAPPY");
		}
	}
}