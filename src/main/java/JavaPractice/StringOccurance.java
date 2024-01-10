package JavaPractice;

import java.util.TreeMap;

public class StringOccurance {

	
	public static void main(String[] args) {
		//program 1
		String input ="NANDAN";
		char[] chArray = input.toCharArray();
		int count;
		
		for (int i=0; i<chArray.length ; i++) {
			count=1;
			for (int j=i+1; j<chArray.length ; j++) {
				if(chArray[i]==chArray[j]) {
				count++;
				chArray[j]='0';
				}
			}
			if(chArray[i]!='0' && count>=0) {
				System.out.println(chArray[i] +" letter appeared at " + count +" times");
			}

		}
		
		//program2
		 String str = "HelloWorld";
		 str = str.toLowerCase();
	        int cnt;
	        char[] chArr = str.toCharArray();
	        
//	        for (int i=0;i<chArr.length;i++) {
//	        	cnt = 1;
//	            for (int j=i+1; j<chArr.length; j++) {
//	                if (chArr[i]==chArr[j]){
//	                	cnt++ ;
//	                chArr[j]='0';
//	                             }
//	                            }
//	                            if (chArr[i]!='0'){
//	                              //  System.out.println(chArr[i] +" count of apperance :"+ cnt) ;
//	                            }
//	           
//	        }
	        
	        //program3 and found the greatest repeated char
	        TreeMap<Character, Integer> greatRepeat = new TreeMap<Character, Integer>();
	        for (int i=0;i<chArr.length;i++) {
	        	int cnt1 = 1;
	            for (int j=i+1; j<chArr.length; j++) {
	                if (chArr[i]==chArr[j]){
	                	cnt1++ ;
	                chArr[j]='0';
	                             }
	                            }
	                            if (chArr[i]!='0'){
	                                System.out.println(chArr[i] +" count of apperance :"+ cnt1) ;
	                                greatRepeat.put(chArr[i], cnt1);
	                            }
	                            
	           
	        }System.out.println(greatRepeat);
	        System.out.println(greatRepeat);
				

	}

}
