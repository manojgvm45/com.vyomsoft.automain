package JavaPractice;

import java.util.LinkedHashMap;

public class StringOccuranceCollection {

	public static void main(String[] args) {
		//change string into lower case
		//Convert string into char array
		//use linked hash map to avoid duplicates and initialize with character and integer as generics
		//use for each loop to iterate char value and use if condition
		//if contains Key is char means add char and integer as get index+1
		//else add char and count 1
		 String str ="ManojBabu";
				str= str.toLowerCase();
			char[] newStr = str.toCharArray();
			LinkedHashMap<Character, Integer> repeat = new LinkedHashMap<Character, Integer>();
			for (char c : newStr) {
				if (repeat.containsKey(c)) {
					repeat.put(c, repeat.get(c)+1);
				}else {
					repeat.put(c, 1);
				}

				
			}				System.out.println(repeat+"test");


	}

}
