package com.latifbenzzine.challenges;

public class Permutation {
	
	public static void main(String [] args){
		String test1 = "ABC";
		String test2 = "BCA";
		System.out.println(isPermutation(test1, test2));
	}
	
	
	public static boolean isPermutation(String test1, String test2){
		
		if(test1.length() != test2.length()){
			return false;
		}
		char[] toChar = test1.toCharArray();
		for(char character:toChar){
						if(!test2.contains(String.valueOf(character))){
				return false;
			}
			
			
			}
			
			
		

		return true;
		
		
	}

}
