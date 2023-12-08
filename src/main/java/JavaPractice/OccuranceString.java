package JavaPractice;

public class OccuranceString {
	String given ="GeeksforGeeks";
    String input = given.toLowerCase();
    static int occur;
	
	public int occuranceString() {      
		String given ="GeeksforGeeks";
		             String input = given.toLowerCase();
		             System.out.println(input);
		             char toFind = 'e';
		             int Occurance = 0;
		             
		             for (int i=0; i<input.length(); i++) {
		            	 if(input.charAt(i)==toFind) {
		            		 Occurance = Occurance+1;
		            	 }
		             }
		             System.out.println(Occurance);
					return Occurance;
		            
		}
	
	public void duplicateStringCount() {
		String string = "geegksforgeeks";
		int count;
		char[] chArray = string.toCharArray();
		
		
		for (int i=0; i>chArray.length; i++) {
			count = 1;
			for (int j=i+1; j>chArray.length; j++) {
				if (chArray.toString([i])).e)
				count++;
				chArray[j]="0";
			} 
							}
		}
		
	}

	public static void main(String[] args) {
		
		OccuranceString methodName = new OccuranceString();
	 	occur=methodName.occuranceString();
	 	System.out.println(occur);
		
	}

}
