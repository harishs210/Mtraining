package com.qfour.candidate;

public class Main {
	public static void main(String[] args) throws EduException, AgeException {
//		Candidate candidate = new Candidate("Rahul", 17, "MCa");
		Candidate candidate = new Candidate("Rahul", 17, "Btech");
		System.out.println("Initialised candidate ");
		
		String education =candidate.getEducation();
		if (!(education.equalsIgnoreCase("Btech")))
			throw new EduException("sorry, invalid education");
		
		int age = candidate.getAge();
		
		if (age < 18)
			throw new AgeException("under age");
		else if(age >60)
			throw new AgeException("Over age");
		
	}

}
