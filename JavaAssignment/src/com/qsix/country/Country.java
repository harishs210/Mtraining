package com.qsix.country;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Country {
	private TreeMap<String, ArrayList<String>> countryTreemap = new TreeMap<>();
	
	
	
	public void listingCountry(String countryName, List<String> districts) {
		countryTreemap.put(countryName, (ArrayList<String>) districts);
	}
	
	public ArrayList<String> getCountry(String countryName){
		if(countryName == null) {
			return null;
		}
		return countryTreemap.get(countryName);
	}
	
	
	public ArrayList<String> listCountryBefore(String countryName) {
		return countryTreemap.get(countryTreemap.lowerKey(countryName));
	}
	
	public ArrayList<String> listCountryAfter(String countryName) {
		return countryTreemap.get(countryTreemap.higherKey(countryName));
	}
	
}
