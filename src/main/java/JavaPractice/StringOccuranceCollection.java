package JavaPractice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class StringOccuranceCollection {
	
	public void charOccurance() {
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
					List<LinkedHashMap<Character, Integer>> list = new ArrayList<LinkedHashMap<Character, Integer>>();
					for (char c : newStr) {
						if (repeat.containsKey(c)) {
							repeat.put(c, repeat.get(c)+1);
						}else {
							repeat.put(c, 1);
						}
						
						
					}
					System.out.println(repeat);
					
							//list.add(repeat);
							//System.out.println(list);
	}
	
	public void strOccurance() {
		String str1 = "I LOVE INDIAN CRICIKET AND INDIAN MUSIC AND INDIAN HOCKY";
		String[] strArr = str1.split(" ");
		System.out.println(strArr);
		LinkedHashMap<String, Integer> repeatStr = new LinkedHashMap<String, Integer>();
		for (String newStr : strArr) {
			if (repeatStr.containsKey(newStr)) {
				repeatStr.put(newStr, repeatStr.get(newStr)+1);
			} else {
				repeatStr.put(newStr, 1);
			}
		} System.out.println(repeatStr);

		
	}
	
	public static void main(String[] args) {
		
		    StringOccuranceCollection str  = new StringOccuranceCollection();
		    str.charOccurance();
		    str.strOccurance();
	}

}
