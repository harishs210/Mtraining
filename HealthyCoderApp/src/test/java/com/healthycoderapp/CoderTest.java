package com.healthycoderapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoderTest {
	
	private Coder coder ;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void argumentSetup() {
		coder = new Coder();
		coder.setAge(25);
		coder.setGender(Gender.FEMALE);
		coder.setHeight(152.0);
		coder.setWeight(40.2);
	}

}
