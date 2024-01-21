package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		String str = "IronMan";

			str=str.toLowerCase();
			System.out.println("lengthof str: " +str.length());

			char[] chArray = str.toCharArray();
			System.out.println("lengthof chArray: " +chArray.length);
			
			
			for ( int i=chArray.length-1 ; i>=0 ; i-- ) {
				System.out.print(chArray[i]);
			}
	
	//2nd method
			List<Character> chList = new ArrayList<Character>();
			for (char c : chArray) {
				chList.add(c);
				Collections.reverse(chList);
				ListIterator<Character> list = chList.listIterator();
				while(list.hasNext()) {
					System.out.print(list.next());
				}					
				System.out.println(chList);
			}
			
	}

}
