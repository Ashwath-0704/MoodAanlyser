package com.javapractices;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	/*
	 * UC1 and UC2 Testing.
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
	 * UC1 and UC2 Testing.
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
}