package JavaPractice;

import java.util.TreeSet;

public class AlphabetWords {

	public static void main(String[] args) {
			String str="i love india and music and zebra and peacock";
			
			String[] strArr = str.split(" ");
			
			TreeSet<String> treeSort = new TreeSet<String>();
			
			for (String string : strArr) {
				 treeSort.add(string);
							}
			System.out.print(treeSort);
			

	}
	

}
