package seleniumPractice;

public class StringRegex {

	public static void main(String[] args) {
		
		String str = "Search 4 records !@";
		//to get numeric
		String newStr = str.replaceAll("[^\\d.]", "");
		//another method replaceAll("[^0-9.]", "");
		System.out.println(newStr);
		//to convert string into Integer
		 int newInt = Integer.parseInt(newStr);
		 System.out.println(newInt);
		 //to get string value
		 
		 String str1 = "Search 1000 records";
				 str1 = str1.replaceAll("[^a-z.^A-Z.]", "");
		System.out.println(str1); 
		
	}

}
