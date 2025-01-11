package com.ramesh;

public class MapCharacters {
	
	/*
	 * a-1
	 * b-2
	 * c-3
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    char[] characters = {'a', 'b', 'c', 'z'};
        
        // Map and print each character
        for (char ch : characters) {
            int mappedValue = (ch - 'a') + 1; // Calculate mapping
            System.out.println(ch + " -> " + mappedValue);
        }

	}

}
