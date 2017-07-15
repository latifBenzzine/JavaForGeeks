package com.latifbenzzine.challenges;


public class uniqueCharacters {
	
	
	
	
	public static void main(String[] args){
	
	//ArrayList<Character> list = new ArrayList<>();
	String str = "abcdefgha";
	System.out.println(hasUniqueCharacters(str));
	
	}
	
	public static boolean hasUniqueCharacters(String test){
		
	if(test.length() > 0){
		char[] toChar = test.toCharArray();
	
	for(char character:toChar){
		int counter = 0;
		for(int i = 0 ; i < toChar.length; i++){
			if(character == (test.charAt(i))){
				System.out.print("the index is : " + i + " ,");
				counter ++;
				
			}
			
		}
		if(counter > 1){
			System.out.println("the repeated character was " + "[" + character + "]" +  "  counter was at " + counter);
			return false;
			
		}else{
			return true;
		}
	}
	
	}else{
		return false;
	}
	return false;
	
}
	
}
	

