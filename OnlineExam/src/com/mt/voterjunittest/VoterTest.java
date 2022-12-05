package com.mt.voterjunittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junit.framework.Assert;

public class VoterTest {
	
	
	@Test
	public void voterAgeWrongTest() throws Exception {
		int age = 0;
		Voter voter = new Voter();
		Exception exceptin = Assertions.assertThrows(Exception.class, () -> voter.isValidAge(age));
		
	}
	
	@Test
	public void voterAgeValidTest() throws Exception {
		int age = 19;
		Voter voter = new Voter();
		boolean result = voter.isValidAge(age);
		Assertions.assertTrue(result);
		
	}
	
	@Test
	public void voterAgeInValidTest() throws Exception {
		int age = 17;
		Voter voter = new Voter();
		boolean result = voter.isValidAge(age);
		Assertions.assertFalse(result);
		
	}
	
	@ParameterizedTest
	@CsvSource(value = {"21, true", "17, false", "56, true"})
	public void voterAgeValidateTestParameterized( int age, boolean expected) throws Exception {
		Voter voter = new Voter();
		boolean result = voter.isValidAge(age);
		Assertions.assertEquals(result, expected);
	}
}
