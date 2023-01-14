package com.qsix.country;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Country country = new Country();
		List<String> indiaDistrict = new ArrayList<>();
		
		indiaDistrict.add("Kolkata");
		indiaDistrict.add("Medinpur");
		indiaDistrict.add("Balasore");
		indiaDistrict.add("Bhubaneswar");
		indiaDistrict.add("Hyderbad");
		
		List<String> chinaDist = new ArrayList<>();
		
		chinaDist.add("Bejing");
		chinaDist.add("Honkong");
		
		
		List<String> banglaDist = new ArrayList<>();
		
		chinaDist.add("Dhaka");
		chinaDist.add("dhakass");
		
		country.listingCountry("India", indiaDistrict);
		country.listingCountry("China", chinaDist);
		country.listingCountry("Bangladesh", banglaDist);
		
		
		String key= "China";
		
		List<String> districts = new ArrayList<>();
		districts =country.getCountry(key);
		
		for (Iterator<String> iterator = districts.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
		System.out.println("*******************");
		
		
		List<String> lowerDistricts = country.listCountryBefore(key);
		
		for (Iterator<String> iterator1 = lowerDistricts.iterator(); iterator1.hasNext();) {
			String string = (String) iterator1.next();
			System.out.println(string);
		}
		
		System.out.println("------------------");
		List<String> higherDistricts = country.listCountryAfter(key);
		
		for (Iterator<String> iterator2 = higherDistricts.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
		
		
		

	}

}
