package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {  
	//algorithm:
	//Split the String into String[] using RegEx
	//using for loop iterate String[i] and make count as 1
	//Using for loop again for String[j] from second word to compare with previous word
	//Make String[j] as "0" for to avoid repeat
	//Using if condition to compare [i] and [j] and greater than count>1 fetch the result
	
	
    public static void main(String[] args) {  
        String string = "Manoj said i love music suga said i love music and movies";  
        String[] strArray = string.split(" ");
        int count;
        
        for (int i=0; i<strArray.length ; i++) {
        	count=1;
        		for (int j=i+1; j<strArray.length ; j++ ) {
        			if (strArray[i].equals(strArray[j])) {
        			count++;
        			strArray[j]="0";
        			}
        		} 
        		if (count>1 &&(strArray[i]!="0")) {
            		System.out.println(strArray[i] + " times coming :" + count);
            	}
        	}
        Map<String, Integer> stringMap = new HashMap<>();
        
        for (String mapStr : strArray) {
        	if(stringMap.get(mapStr)!=null){
        		stringMap.put(mapStr, stringMap.get(mapStr)+1);
        	}else {
        		stringMap.put(mapStr, 1);
        	}			
		}
        Set<String> stringSet = stringMap.keySet();
        for (String finalStr : stringSet) {
        	if (stringMap.get(finalStr)>1) {
        		System.out.println(stringMap);
        	}

        	
		}
        String expression 
        = "Hi I am Hritik and I am a programmer"; 

    // splitting words using regex 
    String[] words = expression.split(" "); 

    // we are creating a Map for storing 
    // strings and it's occurrence" 
    Map<String, Integer> word_map = new HashMap<>(); 

    // Here we are iterating in words array and 
    // increasing it's occurrence by 1. 
    for (String word : words) { 

        if (word_map.get(word) != null) { 
            word_map.put(word, word_map.get(word) + 1); 
        } 

        // if the word came once then occurrence is 1. 
        else { 
            word_map.put(word, 1); 
        } 
    } 

    // creating a keyset of word_map 
    Set<String> word_set = word_map.keySet(); 

    // We are iterating in word set 
    for (String word : word_set) { 

        // if word matched then checking occurrence 
        if (word_map.get(word) > 1) 

            // here we are printing the duplicate words 
            System.out.println(word); 
    } 


        }
        
    }
 
