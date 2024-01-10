package JavaPractice;

import java.util.TreeMap;
import java.util.TreeSet;

public class GreatestSubstring {

	public static void main(String[] args) {
			String[] str = {"hjdhdbjjads","erfdvchvjvnjvhvvvvgvhgvhs","hcsbjhcbsjhcsjc"};
			
			
			
			TreeSet<Integer> treeSort = new TreeSet<Integer>();
			for(String strEach : str) {
				//int lengthofWord = strEach.length();
				//System.out.println(strEach+":"+lengthofWord);
				int length = strEach.length();
				treeSort.add(strEach.length());
				for (int i=0 ; i>length; i++) {
					int max = length;
				}
			}
				int greatest = treeSort.pollLast();
				if (greatest==length) {
					System.out.println("Greatest Substring is: " + strEach + length );
				}
				
		
			
			
			System.out.println(treeSort);
		//	int greatest = treeSort.pollLast();
		//	System.out.println("greatest substring: "+greatest);

			TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
					
			for(String strMap : str) {
				treeMap.put(strMap, strMap.length());
			}
				treeMap.pollLastEntry();
			System.out.println("greatest substring and value: "+ treeMap.pollLastEntry() );

			
	}

}
