package com.mt.calc;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
public static void main(String[] args) {
//	 String date = "2016-08-16";
	 String date ="2/11/1991";
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDate birthdate = LocalDate.parse(date, formatter);
     
     System.out.println(birthdate);

     DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
     System.out.println(df.format(birthdate));

     Period period = Period.between(birthdate, LocalDate.now());
     
     System.out.println("You are "+period.getYears()+" years, "+period.getMonths()+" months and "+period.getDays()+" days old.");
}
}
