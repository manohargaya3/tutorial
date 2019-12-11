package com.manohar.tutorial;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CountSecondHighestCharInString {

	public static void main(String args[]) {

		String input = "paypal india";

		char[] charArray = input.toCharArray();
		Map<Character, Integer> countCharacters = new HashMap<Character, Integer>();
		for (char charValue : charArray) {
			if(countCharacters.containsKey(charValue)) {
				countCharacters.put(charValue, countCharacters.get(charValue)+1);
			}
			else {
				countCharacters.put(charValue,1);
			}
		}
		
		System.out.println(countCharacters);
		
		Set<Integer> count = new TreeSet<Integer>();
		
		for(Map.Entry<Character, Integer> entry: countCharacters.entrySet()) {
			count.add(entry.getValue());
		}
		
		System.out.println(count);
		
		for(Map.Entry<Character, Integer> entry: countCharacters.entrySet()) {
			if(entry.getValue()==count.toArray()[count.toArray().length-2]) {
				System.out.println(entry.getKey());
			}
		}
		
	}

}
