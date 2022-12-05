package com.mt.voterjunittest;

public class Voter {
	
	public boolean isValidAge(int age) throws Exception {
		if(age<=0) {
			throw new Exception("Invalid age, Should not be Zero 0r -ve");
		}
		else if (age <=18) {
			return false;
		}else
			return true;
	}

}
