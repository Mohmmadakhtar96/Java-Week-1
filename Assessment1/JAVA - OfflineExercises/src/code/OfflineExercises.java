﻿package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		
		String duplicate = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!duplicate.contains(String.valueOf(input.charAt(i)))) {
	            duplicate += String.valueOf(input.charAt(i));
	        }
	    }
	            return input;
	        
	    }
	    
			
	//
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "elivc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		
		String reverse = " ";
		StringBuilder sB = new StringBuilder(reverse).reverse();
		
			
		
		return "sB";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		
		if (int a1  ; < int b1 ; int c1) {
		
		return false;
		}
		else {
			if (int a1 > int b1 > int c1) {
				return true;
			}
		}
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		
		
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("cooldev") → true
	// endsDev("jh") → false
	// endsDev("coolev") → false

	public boolean endsDev(String input) {
		
		String newString = toString();
		
		if (newString.endsWith("dev")) {
		 		return true;	 
	}
		else {
	
			return false;
		}
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "xxppp9"
	// yields "xp9".

	// RECURSIVE

	// stringClean("xxppp9") → "xp9"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Heellooo") → "Helo"
	public String stringClean(String input) {
	
		String orginal = " ";
		if(orginal.length()<2 ) {
			return orginal;
		}
		
		return stringClean(orginal.substring(1)) + orginal.charAt (0);
		
		return "stringClean";
	}

	// Each subsequent Fibonacci value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the sum of
	// the first
	// n numbers.

	// RECURSIVE

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 2
	// fibonacci(7) → 33

	public int fibonacci(int input) {
		
		
		return -1;
	}

	// Given a number multiply that number by 2 - using recursion
	// do not use any loops

	// RECURSIVE

	// simpleRecursion(0) → 0
	// simpleRecursion(1) → 2
	// simpleRecursion(2) → 4

	public int simpleRecursion(int input) {
		
		int i = 0;
		if (i == 0) 
			return 0;
		

		return i * 2;

	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		
		String duplicate = (" ");
		int count;
		
		for (String s : duplicate) {
			if(s.length());
			count++;
		}
			
		
		return -1;

	}

}
